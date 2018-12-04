/**
 * 
 */
package com.kidounit.teere.core.builder;

import com.kidounit.teere.core.model.Categorie;

/**
 * @author modou
 *
 */
public class CategorieBuilder {

	String id="1";
	String nom="Spiritualité";
	
	 /**
	   * Construit la catégorie.
	   *
	   * @return la catégorie
	   */
	  public Categorie build() {
	    return new Categorie(id, nom);
	  }
}
