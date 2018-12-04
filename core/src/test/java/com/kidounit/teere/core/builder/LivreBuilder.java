package com.kidounit.teere.core.builder;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.kidounit.teere.core.model.Auteur;
import com.kidounit.teere.core.model.Categorie;
import com.kidounit.teere.core.model.Editeur;
import com.kidounit.teere.core.model.Livre;
import com.kidounit.teere.core.model.Prix;

/**
 * 
 * @author modou
 *
 */
public class LivreBuilder {

    String id="1";
	String titre="Les Rimah";
	List<Auteur> auteur= Arrays.asList(new AuteurBuilder().build());
	String format= "livre";
	Integer nbPages=235;
	Editeur editeur= new EditeurBuilder().build();
	String langue= "francais";
	List<Prix> listeDesPrix= Arrays.asList(new PrixBuilder().build());
	String description= "Glose marginale des jawahir al maani, texte centrat de la confrérie soufie sunnite tijaniyya, dicté par son fondateur...";
	List<Categorie> categories = Arrays.asList(new CategorieBuilder().build());
	Date dateAchat=new Date();
	String anneeParution= "2017";
	Integer prix= 22;
	String isbn= "9791022502078";
	Boolean estLu= false;
	
	 /**
	   * Construit le livre.
	   *
	   * @return le livre
	   */
	  public Livre build() {

		return new Livre(id, titre, auteur, format, nbPages, editeur, langue, listeDesPrix, description, categories, dateAchat, anneeParution, prix, isbn, estLu);
	  }
}
