/**
 * 
 */
package com.kidounit.teere.core.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kidounit.teere.core.model.Editeur;

/**
 * @author modou
 *
 */
public interface EditeurRepository extends MongoRepository<Editeur, String> {

}
