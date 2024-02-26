package gp.gp.model.cage;

import jakarta.persistence.*;

@Entity
@Table(name="cages")
public class Cage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cage_id;
	
	@Column(name="name", nullable=false)
	private String name;
	
	@Column(name="description", nullable=true)
	private String description;
	
	public Cage() {
		super();
	}

	/**
	 * @param cage_id
	 * @param name
	 * @param description
	 */
	public Cage(Long cage_id, String name, String description) {
		super();
		this.cage_id = cage_id;
		this.name = name;
		this.description = description;
	}

	/**
	 * @return the cage_id
	 */
	public Long getCage_id() {
		return cage_id;
	}

	/**
	 * @param cage_id the cage_id to set
	 */
	public void setCage_id(Long cage_id) {
		this.cage_id = cage_id;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Cage [cage_id=" + cage_id + ", name=" + name + ", description=" + description  + "]";
	}	

}
