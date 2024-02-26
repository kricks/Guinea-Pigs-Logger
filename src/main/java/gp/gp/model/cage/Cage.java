package gp.gp.model.cage;

import java.util.Set;

import gp.gp.model.guineaPig.GuineaPig;
import jakarta.persistence.*;

@Entity
@Table(name="cages")
public class Cage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cart_id;
	
	@Column(name="name", nullable=false)
	private String name;
	
	@Column(name="description", nullable=true)
	private String description;
	
	@OneToMany(mappedBy="cage")
	private Set<GuineaPig> guineaPig;
	
	public Cage() {
		super();
	}

	/**
	 * @param cart_id
	 * @param name
	 * @param description
	 * @param guineaPig
	 */
	public Cage(long cart_id, String name, String description, Set<GuineaPig> guineaPig) {
		super();
		this.cart_id = cart_id;
		this.name = name;
		this.description = description;
		this.guineaPig = guineaPig;
	}

	/**
	 * @return the cart_id
	 */
	public long getCart_id() {
		return cart_id;
	}

	/**
	 * @param cart_id the cart_id to set
	 */
	public void setCart_id(long cart_id) {
		this.cart_id = cart_id;
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

	/**
	 * @return the guineaPig
	 */
	public Set<GuineaPig> getGuineaPig() {
		return guineaPig;
	}

	/**
	 * @param guineaPig the guineaPig to set
	 */
	public void setGuineaPig(Set<GuineaPig> guineaPig) {
		this.guineaPig = guineaPig;
	}

	@Override
	public String toString() {
		return "Cage [cart_id=" + cart_id + ", name=" + name + ", description=" + description + ", guineaPig="
				+ guineaPig + "]";
	}
	

}
