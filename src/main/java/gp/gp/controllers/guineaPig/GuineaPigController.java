package gp.gp.controllers.guineaPig;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import gp.gp.model.guineaPig.GuineaPig;
import gp.gp.repository.guineaPig.GuineaPigRepo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/guineaPig")
public class GuineaPigController {

	@Autowired
	private GuineaPigRepo gpr;
	
	@GetMapping("/all")
	public ResponseEntity<List<GuineaPig>> getAllCages() {
		List<GuineaPig> gp = gpr.findAll();
		return new ResponseEntity<>(gp, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<GuineaPig> createCage(@RequestBody GuineaPig guineaPig) {
		GuineaPig gp = gpr.save(guineaPig);
		return new ResponseEntity<>(gp, HttpStatus.OK);
	}

}
