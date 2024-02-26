package gp.gp.model.guineaPig;

import java.util.Arrays;

import gp.gp.model.cage.Cage;
import jakarta.persistence.*;

@Entity
@Table(name="guinea_pig")
public class GuineaPig {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long guinea_pig_id;
	
	@Column(name="name", nullable=false)
	private String name;
	
	@Column(name="breed", nullable=true)
	private String breed;
	
	@Column(name="age", nullable=true)
	private Integer age;
	
	@Column(name="cage_mate", nullable=true)
	private String[] cageMate;
	
	@ManyToOne
	@JoinColumn(name="cart_id", nullable=false)
	private Cage cage;

	public GuineaPig() {
		super();
	}

	/**
	 * @param guinea_pig_id
	 * @param name
	 * @param breed
	 * @param age
	 * @param cageMate
	 * @param cage
	 */
	public GuineaPig(long guinea_pig_id, String name, String breed, Integer age, String[] cageMate, Cage cage) {
		super();
		this.guinea_pig_id = guinea_pig_id;
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.cageMate = cageMate;
		this.cage = cage;
	}

	/**
	 * @return the guinea_pig_id
	 */
	public long getGuinea_pig_id() {
		return guinea_pig_id;
	}

	/**
	 * @param guinea_pig_id the guinea_pig_id to set
	 */
	public void setGuinea_pig_id(long guinea_pig_id) {
		this.guinea_pig_id = guinea_pig_id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}

	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the cageMate
	 */
	public String[] getCageMate() {
		return cageMate;
	}

	/**
	 * @param cageMate the cageMate to set
	 */
	public void setCageMate(String[] cageMate) {
		this.cageMate = cageMate;
	}

	/**
	 * @return the cage
	 */
	public Cage getCage() {
		return cage;
	}

	/**
	 * @param cage the cage to set
	 */
	public void setCage(Cage cage) {
		this.cage = cage;
	}

	@Override
	public String toString() {
		return "GuineaPig [guinea_pig_id=" + guinea_pig_id + ", name=" + name + ", breed=" + breed + ", age=" + age
				+ ", cageMate=" + Arrays.toString(cageMate) + ", cage=" + cage + "]";
	}

}
