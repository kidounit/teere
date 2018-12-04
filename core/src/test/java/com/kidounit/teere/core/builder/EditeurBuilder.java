/**
 * 
 */
package com.kidounit.teere.core.builder;


import com.kidounit.teere.core.model.Editeur;

/**
 * @author modou
 *
 */
public class EditeurBuilder {

	String id= "1";
	String nom = "AlBouraq";
	
	 /**
	   * Construit la catégorie.
	   *
	   * @return la catégorie
	   */
	  public Editeur build() {
	    return new Editeur(id, nom);
	  }
}
