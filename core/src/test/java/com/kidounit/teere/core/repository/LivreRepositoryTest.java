/**
 * 
 */
package com.kidounit.teere.core.repository;



import static org.assertj.core.api.Assertions.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.kidounit.teere.core.builder.LivreBuilder;
import com.kidounit.teere.core.model.Livre;

/**
 * @author modou
 *
 */
@RunWith(SpringRunner.class)
//@SpringBootTest
@DataMongoTest // dÈsactive l'autoconfig de Springboot et va crÈer un MongoTemplate, un mongoDB
            // connection et une instance mongoDB, ainsi que le repository mongoDB
public class LivreRepositoryTest {

	  @Autowired
	  private LivreRepository livreRepository;
	

	  @Before
	  public void setUp() throws Exception {

	    Livre livre001 = new LivreBuilder().build();

	    this.livreRepository.save(livre001);
	 // save livre, verify has ID value after save
	    assertThat(livre001.getId()).isNotNull();

	  }


	  /**
	   * Test fetch data.
	   */
	  @org.junit.Test
	  public void testFetchData() {
	    /* Test data retrieval */
	    Livre livreRecupere = livreRepository.findById("1").get();
	    assertThat(livreRecupere).isNotNull();
	    assertThat(livreRecupere.getEditeur().getNom()).isEqualTo("AlBouraq");
	     //RÈcupËre toute la liste 
	    Iterable<Livre> livres = livreRepository.findAll();
	    int count = 0;
	    for (Livre p : livres) {
	      count++;
	    }
	    assertThat(count == 1).isTrue();
	  }


	  /**
	   * Test data update.
	   */
	  @Test
	  public void testDataUpdate() {
	    /* Test update */
	   Livre livreRecupere01 = livreRepository.findById("1").get();
	    livreRecupere01.getAuteur().get(0).setNom("Dieng");
	    livreRepository.save(livreRecupere01);
	    Livre livreRecupere02 = livreRepository.findById("1").get();
	    assertThat(livreRecupere02);
	    assertThat(livreRecupere02.getAuteur().get(0).getNom()).isEqualTo("Dieng"); 
	  }



	  /**
	   * Tear down.
	   *
	   * @throws Exception the exception
	   */
	  @After
	  public void tearDown() throws Exception {
	    this.livreRepository.deleteAll();
	  }

}
