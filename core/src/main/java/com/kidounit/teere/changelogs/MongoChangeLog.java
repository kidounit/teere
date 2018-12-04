/**
 * 
 */
package com.kidounit.teere.changelogs;


import java.util.Arrays;
import java.util.Date;

import com.github.mongobee.changeset.ChangeLog;
import com.github.mongobee.changeset.ChangeSet;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;

/**
 * @author modou
 *
 */
@ChangeLog
public class MongoChangeLog {
	
/*	
	@ChangeSet(order = "0023", id = "insertLivre", author = "Mouhamadou Ndiaye")
	public void someChange5( MongoTemplate mongoTemplate) {
	  Livre livre = new LivreBuilder().build();
	  System.out.println();
	  mongoTemplate.save(livre);
	}*/
	
	
	@ChangeSet(order = "0013", id = "insertLivres", author = "Mouhamadou Ndiaye")
	public void appendLivre (DB db) {
		DBCollection livresCollection = db.getCollection("livres");
			
	    livresCollection.insert(BasicDBObjectBuilder.start()
	        .add("_id", "1")
	        .add("titre", "Les Rimah")
	        .add("auteurs", Arrays.asList(BasicDBObjectBuilder.start().add("id", "1").add("nom", "Tall").add("prenom", "Cheikh El Hadj Omar Foutiyou").add("dateNaissance", new Date()).add("biographie", "Cheikh dans la tariqa tijaniyya").add("wiki", "").get()))     
	        .add("format", "livre")
	        .add("nbPages", 235)
	        .add("editeurs", BasicDBObjectBuilder.start().add("id", "1").add("nom", "AlBouraq").get())
	        .add("langue", "français")
	        .add("listeDesPrix", null)
	        .add("description", "Glose marginale des jawahir al maani, texte centrat de la confrérie soufie sunnite tijaniyya, dicté par son fondateur...")
	        .add("categories", Arrays.asList(
	        		BasicDBObjectBuilder.start().add("id", "1").add("nom", "Islam").get(),
	        		BasicDBObjectBuilder.start().add("id", "2").add("nom", "Spritualité").get()))
	        .add("dateAchat", new Date())
	        .add("anneeParution", "2017" )
	        .add("prix", 22)
	        .add("isbn", "9791022502078")
	        .add("estLu", false)
	        .get());
	}
	
	/*@ChangeSet(order = "002", id = "someChangeWithMongoDatabase", author = "m.ndiaye")
	public void someChange2(MongoDatabase db) {
	  // type: com.mongodb.client.MongoDatabase : original MongoDB driver v. 3.x, operations allowed by driver are possible
	  // example: 
	  MongoCollection<Document> mycollection = db.getCollection("livres");
	  Document doc = new Document("_id", "1")
		        .append("_id", "1")
	        .append("titre", "Les Rimah")
	        .append("auteurs", new BasicDBObject("id","1").append("nom", "Tall").append("prenom", "Cheikh El Hadj Omar Foutiyou").append("dateNaissance", new Date()).append("biographie", "Cheikh dans la tariqa tijaniyya").append("wiki", ""))     
	        .append("format", "livre")
	        .append("nbPages", 235)
	        .append("editeurs", BasicDBObjectBuilder.start().append("id", "1").append("nom", "AlBouraq").get())
	        .append("langue", "français")
	        .append("listeDesPrix", null)
	        .append("description", "Glose marginale des jawahir al maani, texte centrat de la confrérie soufie sunnite tijaniyya, dicté par son fondateur...")
	        .append("categories", Arrays.asList( new BasicDBObject("id", "1").append("nom", "Islam"),
	        		new BasicDBObject("id", "2").append("nom", "Spiritualité")))
	        .append("dateAchat", new Date())
	        .append("anneeParution", "2017" )
	        .append("prix", 22)
	        .append("isbn", "9791022502078")
	        .append("estLu", false);
	  mycollection.insertOne(doc);
	}*/
}
