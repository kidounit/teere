/**
 * 
 */
package com.kidounit.teere.core.service;

import java.util.List;

import com.kidounit.teere.core.model.Auteur;
import com.kidounit.teere.core.model.Livre;

/**
 * @author modou
 *
 */
public interface LivreService {

	Livre findByTitre(String titre);

	List <Livre>findByAuteur(Auteur auteur);
	
	Livre addLivre(Livre livre);
	
	Livre findById(String id);
	
	List <Livre> findAll();
}
