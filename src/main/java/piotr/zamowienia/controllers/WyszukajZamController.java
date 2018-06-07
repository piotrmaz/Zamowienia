//package piotr.zamowienia.controllers;
//
//
//import java.sql.Date;
//import java.util.List;
//import java.util.Map;
//
//import javax.persistence.EntityGraph;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.FlushModeType;
//import javax.persistence.LockModeType;
//import javax.persistence.Persistence;
//import javax.persistence.Query;
//import javax.persistence.StoredProcedureQuery;
//import javax.persistence.TypedQuery;
//import javax.persistence.criteria.CriteriaBuilder;
//import javax.persistence.criteria.CriteriaDelete;
//import javax.persistence.criteria.CriteriaQuery;
//import javax.persistence.criteria.CriteriaUpdate;
//import javax.persistence.criteria.Root;
//import javax.persistence.metamodel.Metamodel;
//import javax.ws.rs.POST;
//
//import org.apache.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jpa.domain.Specifications;
//import org.springframework.security.access.annotation.Secured;
//import org.springframework.stereotype.Controller;
//import org.springframework.util.StringUtils;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import piotr.zamowienia.models.SzukajZamowieniaForm;
//import piotr.zamowienia.models.Zamowienia;
//import piotr.zamowienia.repository.ZamowieniaRepository;
//import piotr.zamowienia.repository.ZamowieniaSpecifications;
//
//import static org.springframework.data.jpa.domain.Specifications.where;
//
//@RestController
//public class WyszukajZamController {
//	
//	Logger log = Logger.getLogger(WyszukajZamController.class);
//	
//	//jakaś metoda która będzie wyszukiwała wg kryteriów
//	@Autowired
//	ZamowieniaRepository zamowieniaRepository;
//
//	//@POST
//	@RequestMapping(method = RequestMethod.POST, value = "/szukajZamowienia")
//	@Secured(value = { "ROLE_ADMIN", "ROLE_USER" })
//	public List<Zamowienia> szukajZamowienia(SzukajZamowieniaForm form) {
//
//		Integer idZamowienia = form.getIdZamowienia();
//		String nazwaZamowienia = form.getNazwaZamowienia(); 
////		String emailUser = form.getEmailUser();
////		Date dataZamowienia = form.getDataZamowienia();
////		String status = form.getStatus();
////		
//		
//		log.info("idZamowienia: " + idZamowienia + ", nazwaZamowienia: " + nazwaZamowienia);
//		
//				
//		
//		Specifications<Zamowienia> query = where(ZamowieniaSpecifications.nazwaZamowienia(nazwaZamowienia));
//		
//		Specifications<Zamowienia> query1 = where(ZamowieniaSpecifications.idZamowienia(idZamowienia));
//
//
//		
//		
//		if (!StringUtils.isEmpty(idZamowienia))
//			query.and(ZamowieniaSpecifications.idZamowienia(idZamowienia));
//		
//	
//			
//			
//		
//		return zamowieniaRepository.findAll(query.or(query1));
//	}
//
//}
