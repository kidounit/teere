/**
 * 
 */
package com.kidounit.teere.core.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kidounit.teere.core.model.Auteur;

/**
 * @author modou
 *
 */
public interface AuteurRepository extends MongoRepository<Auteur, String> {

}
