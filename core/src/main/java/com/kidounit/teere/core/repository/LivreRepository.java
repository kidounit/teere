/**
 * 
 */
package com.kidounit.teere.core.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kidounit.teere.core.model.Auteur;
import com.kidounit.teere.core.model.Livre;

/**
 * @author modou
 *
 */
public interface LivreRepository extends MongoRepository<Livre, String>  {

	 /**
	   * Find by code.
	   *
	   * @param code the code
	   * @return the product
	   */
	Livre findByTitre(String titre);
	
	List <Livre>findByAuteur(Auteur auteur);
}
