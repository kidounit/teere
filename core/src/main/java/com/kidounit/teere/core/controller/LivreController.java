/**
 * 
 */
package com.kidounit.teere.core.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.kidounit.teere.core.model.Auteur;
import com.kidounit.teere.core.model.Livre;
import com.kidounit.teere.core.service.LivreService;

import io.swagger.annotations.ApiOperation;

/**
 * @author modou
 *
 */
@RestController
public class LivreController {

	@Autowired
	private LivreService livreService;


	@ApiOperation(
			value = "récupère tout les livres", 
			notes = "La liste de tous les livres",
			response = Livre.class, 
			responseContainer = "List", 
			produces = "application/json")
	@GetMapping("/livres/") 
	public List <Livre> getAllLivres() {
		return livreService.findAll();
	}

	@ApiOperation(
			value = "récupère le livre correspondant à l'id", 
			notes = "un livre",
			response = Livre.class,  
			produces = "application/json")
	@GetMapping("/livres/{id}") 
	public Livre getLivre(@PathVariable String id) {
		return livreService.findById(id);
	}
	@ApiOperation(
			value = "récupère le livre correspondant à l'auteur", 
			notes = "un livre",
			response = Livre.class,  
			produces = "application/json")
	@GetMapping("/livres/{auteur}") 
	public List<Livre> getLivreParAuteur(@PathVariable Auteur auteur) {
		return livreService.findByAuteur(auteur);
	}

	@ApiOperation(
			value = "récupère le livre correspondant au titre", 
			notes = "un livre",
			response = Livre.class,  
			produces = "application/json")
	@GetMapping("/livres/{titre}") 
	public Livre getLivreParTitre(@PathVariable String titre) {
		return livreService.findByTitre(titre);
	}

	@ApiOperation(
			value = "ajoute un livre", 
			produces = "application/json")
	@PostMapping("/livres/") 
	public ResponseEntity<?> addLivre(@RequestBody Livre livre) {

		if(livre == null) {
			return ResponseEntity.noContent().build();
		}

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(livre.getId()).toUri();

		return ResponseEntity.created(location).build();
	}
}
