package com.kidounit.teere.core.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * La Classe Product.
 *
 * @author m.ndiaye
 */
@Document(collection = "livres")
public class Livre {

	 /** L'id. */
	 @Id
	private String id;
	
	private String titre;
	
	private List<Auteur> auteur;
	
	//pdf ou epub ou papier...
	private String format;
	
	private Integer nbPages;
	
	private Editeur editeur;
	
	private String langue;
	
	private List<Prix> listeDesPrix;
	
	private String description;
	
	private List<Categorie> categories;
	
	private Date dateAchat;
	
	private String anneeParution;
	
	private Integer prix;
	
	private String isbn;
	
	private Boolean estLu;

	
	/**
	 * 
	 */
	public Livre() {
		super();
	}


	/**
	 * @param id
	 * @param titre
	 * @param auteur
	 * @param format
	 * @param nbPages
	 * @param editeur
	 * @param langue
	 * @param listeDesPrix
	 * @param description
	 * @param categories
	 * @param dateAchat
	 * @param anneeParution
	 * @param prix
	 * @param isbn
	 * @param estLu
	 */
	public Livre(String id, String titre, List<Auteur> auteur, String format, Integer nbPages, Editeur editeur,
			String langue, List<Prix> listeDesPrix, String description, List<Categorie> categories, Date dateAchat,
			String anneeParution, Integer prix, String isbn, Boolean estLu) {
		super();
		this.id = id;
		this.titre = titre;
		this.auteur = auteur;
		this.format = format;
		this.nbPages = nbPages;
		this.editeur = editeur;
		this.langue = langue;
		this.listeDesPrix = listeDesPrix;
		this.description = description;
		this.categories = categories;
		this.dateAchat = dateAchat;
		this.anneeParution = anneeParution;
		this.prix = prix;
		this.isbn = isbn;
		this.estLu = estLu;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}


	/**
	 * @return the auteur
	 */
	public final List<Auteur> getAuteur() {
		return auteur;
	}



	/**
	 * @param auteur the auteur to set
	 */
	public final void setAuteur(List<Auteur> auteur) {
		this.auteur = auteur;
	}



	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public Integer getNbPages() {
		return nbPages;
	}

	public void setNbPages(Integer nbPages) {
		this.nbPages = nbPages;
	}

	public Editeur getEditeur() {
		return editeur;
	}

	public void setEditeur(Editeur editeur) {
		this.editeur = editeur;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public List<Prix> getListeDesPrix() {
		return listeDesPrix;
	}

	public void setListeDesPrix(List<Prix> listeDesPrix) {
		this.listeDesPrix = listeDesPrix;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Categorie> getCategories() {
		return categories;
	}

	public void setCategories(List<Categorie> categories) {
		this.categories = categories;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	public String getAnneeParution() {
		return anneeParution;
	}

	public void setAnneeParution(String anneeParution) {
		this.anneeParution = anneeParution;
	}

	public Integer getPrix() {
		return prix;
	}

	public void setPrix(Integer prix) {
		this.prix = prix;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Boolean getEstLu() {
		return estLu;
	}

	public void setEstLu(Boolean estLu) {
		this.estLu = estLu;
	}
	
}
