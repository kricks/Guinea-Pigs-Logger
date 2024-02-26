package gp.gp.controllers.cage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import gp.gp.model.cage.Cage;
import gp.gp.repository.cage.CageRepo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/cage")
public class CageController {
	
	@Autowired
	private CageRepo cr;
	
	@GetMapping("/all")
	public ResponseEntity<List<Cage>> getAllCages() {
		List<Cage> c = cr.findAll();
		return new ResponseEntity<>(c, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<Cage> createCage(@RequestBody Cage cage) {
		Cage c = cr.save(cage);
		return new ResponseEntity<>(c, HttpStatus.OK);
	}

}
