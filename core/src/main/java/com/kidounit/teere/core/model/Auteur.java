/**
 * 
 */
package com.kidounit.teere.core.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author modou
 *
 */
@Document(collection = "auteurs")
public class Auteur {

	 /** L'id. */
	@Id
	private String id;
	
	private String nom;
	
	private String prenom;
	
	private Date dateNaissance;
	
	private String biographie;
	
	private String wiki;
	

	
	/**
	 * 
	 */
	public Auteur() {
		super();
	}

	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 * @param biographie
	 * @param wiki
	 */
	public Auteur(String id, String nom, String prenom, Date dateNaissance, String biographie, String wiki) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.biographie = biographie;
		this.wiki = wiki;
	}

	public final String getId() {
		return id;
	}

	public final void setId(String id) {
		this.id = id;
	}

	public final String getNom() {
		return nom;
	}

	public final void setNom(String nom) {
		this.nom = nom;
	}

	public final String getPrenom() {
		return prenom;
	}

	public final void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public final Date getDateNaissance() {
		return dateNaissance;
	}

	public final void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public final String getBiographie() {
		return biographie;
	}

	public final void setBiographie(String biographie) {
		this.biographie = biographie;
	}

	public final String getWiki() {
		return wiki;
	}

	public final void setWiki(String wiki) {
		this.wiki = wiki;
	}
	
	
}
