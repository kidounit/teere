/**
 * 
 */
package com.kidounit.teere.core.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author modou
 *
 */
@Document(collection = "prix")
public class Prix {

	 /** L'id. */
	 @Id
	private String id;
	@Indexed(unique = true)
	private String nom;
	
	private String description;

	
	
	/**
	 * 
	 */
	public Prix() {
		super();
	}



	/**
	 * @param id
	 * @param nom
	 * @param description
	 */
	public Prix(String id, String nom, String description) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
	}



	/**
	 * @return the id
	 */
	public final String getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public final void setId(String id) {
		this.id = id;
	}



	/**
	 * @return the nom
	 */
	public final String getNom() {
		return nom;
	}



	/**
	 * @param nom the nom to set
	 */
	public final void setNom(String nom) {
		this.nom = nom;
	}



	/**
	 * @return the description
	 */
	public final String getDescription() {
		return description;
	}



	/**
	 * @param description the description to set
	 */
	public final void setDescription(String description) {
		this.description = description;
	}
	
	
}
