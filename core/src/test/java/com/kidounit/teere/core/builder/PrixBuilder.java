/**
 * 
 */
package com.kidounit.teere.core.builder;

import com.kidounit.teere.core.model.Prix;

/**
 * @author modou
 *
 */
public class PrixBuilder {

	String id="1";
	String nom="Goncourt"; 
	String description="prix littéraire français récompensant des auteurs d'expression française";
	
	
	
	 /**
	   * Construit le prix.
	   *
	   * @return le prix
	   */
	  public Prix build() {
	    return new Prix(id, nom, description);
	  }
	  
	  /**
	   * Avec id.
	   *
	   * @param id L'id
	   * @return le prix builder
	   */
	  public PrixBuilder avecPourId(final String id) {
	    this.id = id;
	    return this;

	  }
	  
	  /**
	   * Avec id.
	   *
	   * @param id L'id
	   * @return le prix builder
	   */
	  public PrixBuilder avecPourNom(final String nom) {
	    this.nom = nom;
	    return this;

	  }
}
