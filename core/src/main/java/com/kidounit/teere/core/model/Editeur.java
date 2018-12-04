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
@Document(collection = "editeurs")
public class Editeur {
	/** L'id. */
	@Id
	private String id;
	@Indexed(unique = true)
	private String nom;

	
	
	/**
	 * 
	 */
	public Editeur() {
		super();
	}

	/**
	 * @param id
	 * @param nom
	 */
	public Editeur(String id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
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
	
	

}
