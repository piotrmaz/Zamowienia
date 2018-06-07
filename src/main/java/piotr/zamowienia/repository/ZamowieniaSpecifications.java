package piotr.zamowienia.repository;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;
<<<<<<< HEAD

import piotr.zamowienia.controllers.ZamowieniaController;
import piotr.zamowienia.models.SzukajZamowieniaForm;
import piotr.zamowienia.models.Zamowienia;
import piotr.zamowienia.service.ZamowieniaService;
import piotr.zamowienia.service.impl.ZamowieniaServiceImpl;
=======
import piotr.zamowienia.models.SzukajZamowieniaForm;
import piotr.zamowienia.models.Zamowienia;
>>>>>>> 50367bbfa033a1df40975e4d2279cbb97b7fa992

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
<<<<<<< HEAD

import java.awt.print.Pageable;
=======
>>>>>>> 50367bbfa033a1df40975e4d2279cbb97b7fa992
import java.util.ArrayList;
import java.util.List;

public class ZamowieniaSpecifications implements Specification<Zamowienia> {

	private SzukajZamowieniaForm szukajZamowieniaForm;

	public ZamowieniaSpecifications(SzukajZamowieniaForm szukajZamowieniaForm) {
		this.szukajZamowieniaForm = szukajZamowieniaForm;
	}

	@Override
	public Predicate toPredicate(Root<Zamowienia> root, CriteriaQuery<?> query, CriteriaBuilder cb) {

		List<Predicate> predicates = new ArrayList<>();
<<<<<<< HEAD
		

		if (!StringUtils.isEmpty(szukajZamowieniaForm.getNazwaZamowienia())) {
			//predicates.add(cb.like(root.get("nazwaZamowienia"), szukajZamowieniaForm.getNazwaZamowienia()));
			final Predicate nazwaZamowienia = cb.equal(root.<String>get("nazwaZamowienia"), szukajZamowieniaForm.getNazwaZamowienia());
			predicates.add(nazwaZamowienia);
=======

		if (!StringUtils.isEmpty(szukajZamowieniaForm.getNazwaZamowienia())) {
			predicates.add(cb.equal(root.get("nazwaZamowienia"), szukajZamowieniaForm.getNazwaZamowienia()));
>>>>>>> 50367bbfa033a1df40975e4d2279cbb97b7fa992
		}

		if (szukajZamowieniaForm.getIdZamowienia() != null) {
			predicates.add(cb.equal(root.get("idZamowienia"), szukajZamowieniaForm.getIdZamowienia()));
		}
<<<<<<< HEAD
		
//		if (szukajZamowieniaForm.getEmailUser() != null) {
//			predicates.add(cb.like(root.get("emailUser"), szukajZamowieniaForm.getEmailUser()));
//		}

		return cb.and(predicates.toArray(new Predicate[predicates.size()]));
	}
}
=======

		return cb.and(predicates.toArray(new Predicate[predicates.size()]));
	}
}
>>>>>>> 50367bbfa033a1df40975e4d2279cbb97b7fa992
