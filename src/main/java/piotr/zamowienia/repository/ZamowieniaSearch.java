//package piotr.zamowienia.repository;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.transaction.Transactional;
//
//import org.hibernate.search.jpa.FullTextEntityManager;
//import org.hibernate.search.jpa.Search;
//import org.hibernate.search.query.dsl.QueryBuilder;
//import org.springframework.stereotype.Repository;
//
//import piotr.zamowienia.models.Zamowienia;
//
//@Repository
//@Transactional
//public class ZamowieniaSearch {
//
//	@PersistenceContext
//	private EntityManager entityManager;
//	
//	
//	public List<Zamowienia> search(String text) {
//		
//		 FullTextEntityManager fullTextEntityManager =
//			      org.hibernate.search.jpa.Search.
//			      getFullTextEntityManager(entityManager);
//		  
//		try {
//			fullTextEntityManager 
//			  = Search.getFullTextEntityManager(entityManager);
//			fullTextEntityManager.createIndexer().startAndWait();
//		} catch (InterruptedException e) {
//			      System.out.println(
//			        "An error occurred trying to build the serach index: " +
//			         e.toString());
//		}
//		
//		 
//		 QueryBuilder queryBuilder = 
//			      fullTextEntityManager.getSearchFactory()
//			      .buildQueryBuilder().forEntity(Zamowienia.class).get();
//		 
//		 
//		 org.apache.lucene.search.Query query =
//			      queryBuilder
//			        .keyword()
//			        .onFields("emailUser", "dataZamowienia", "nazwaZamowienia", "iloscZamowienia", "powodZamowienia", "dataPrzyjecia", "status")
//			        .matching(text)
//			        .createQuery();
//		 
//		 org.hibernate.search.jpa.FullTextQuery jpaQuery =
//			      fullTextEntityManager.createFullTextQuery(query, Zamowienia.class);
//		 
//		 @SuppressWarnings("unchecked")
//		    List<Zamowienia> results = jpaQuery.getResultList();
//		 
//		return results;
//	}
//
//
//}
