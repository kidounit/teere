package com.kidounit.teere.core.builder;

import java.util.Date;

import com.kidounit.teere.core.model.Auteur;

public class AuteurBuilder {

 String id= "1";
	
	 String nom= "Tall";
	
	 String prenom= "Cheikh El Hadj Omar Foutiyou";
	
	 Date dateNaissance= new Date();
	
	 String biographie="Cheikh dans la tariqa tijaniyya";
	
	 String wiki="";
	 
	 /**
	   * Construit l'auteur.
	   *
	   * @return l'auteur
	   */
	  public Auteur build() {
	    return new Auteur(id, nom, prenom, dateNaissance, biographie, wiki);
	  }  
}
