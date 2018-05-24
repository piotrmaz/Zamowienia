//package piotr.zamowienia.repository;
//
//import java.sql.Date;
//
//import javax.persistence.criteria.CriteriaBuilder;
//import javax.persistence.criteria.CriteriaQuery;
//import javax.persistence.criteria.Predicate;
//import javax.persistence.criteria.Root;
//
//import org.springframework.data.jpa.domain.Specification;
//import piotr.zamowienia.models.Zamowienia;
//
//public class ZamowieniaSpecifications {
//
//
//	public static Specification<Zamowienia> nazwaZamowienia(String nazwaZamowienia) {
//		return new Specification<Zamowienia>() {
//			@Override
//			public Predicate toPredicate(Root<Zamowienia> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
//				
//				return cb.equal(root.get("nazwaZamowienia"), nazwaZamowienia);
//			}
//		};
//	}
//	
//	public static Specification<Zamowienia> idZamowienia(Integer idZamowienia) {
//		return new Specification<Zamowienia>() {
//			@Override
//			public Predicate toPredicate(Root<Zamowienia> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
//				
//				return cb.equal(root.get("idZamowienia"), idZamowienia);
//			}
//		};
//	}
//	
//	public static Specification<Zamowienia> emailUser(String emailUser) {
//		return new Specification<Zamowienia>() {
//			@Override
//			public Predicate toPredicate(Root<Zamowienia> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
//				
//				return cb.equal(root.get("emailUser"), emailUser);
//			}
//		};
//	}
//	
//	public static Specification<Zamowienia> dataZamowienia(Date dataZamowienia) {
//		return new Specification<Zamowienia>() {
//			@Override
//			public Predicate toPredicate(Root<Zamowienia> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
//				
//				return cb.equal(root.get("dataZamowienia"), dataZamowienia);
//			}
//		};
//	}
//	
//	public static Specification<Zamowienia> status(String status) {
//		return new Specification<Zamowienia>() {
//			@Override
//			public Predicate toPredicate(Root<Zamowienia> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
//				
//				return cb.equal(root.get("status"), status);
//			}
//		};
//	}
//
//	
//	
//}
