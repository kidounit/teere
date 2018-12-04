/**
 * 
 */
package com.kidounit.teere.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kidounit.teere.core.model.Auteur;
import com.kidounit.teere.core.model.Livre;
import com.kidounit.teere.core.repository.LivreRepository;

/**
 * @author modou
 *
 */
@Service
public class LivreServiceImpl implements LivreService {
	
	@Autowired
	LivreRepository livreRepository;

	@Override
	public Livre findByTitre(String titre) {
		// TODO Auto-generated method stub
		return livreRepository.findByTitre(titre);
	}

	@Override
	public List<Livre> findByAuteur(Auteur auteur) {
		// TODO Auto-generated method stub
		return livreRepository.findByAuteur(auteur);
	}

	@Override
	public Livre addLivre(Livre livre) {
		// TODO Auto-generated method stub
		return livreRepository.insert(livre);
	}

	@Override
	public Livre findById(String id) {
		// TODO Auto-generated method stub
		return livreRepository.findById(id).get();
	}

	@Override
	public List<Livre> findAll() {
		// TODO Auto-generated method stub
		return livreRepository.findAll();
	}

}
