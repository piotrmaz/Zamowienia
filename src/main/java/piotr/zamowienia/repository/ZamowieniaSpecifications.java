package piotr.zamowienia.repository;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;


import piotr.zamowienia.controllers.ZamowieniaController;
import piotr.zamowienia.models.SzukajZamowieniaForm;
import piotr.zamowienia.models.Zamowienia;
import piotr.zamowienia.service.ZamowieniaService;
import piotr.zamowienia.service.impl.ZamowieniaServiceImpl;

import piotr.zamowienia.models.SzukajZamowieniaForm;
import piotr.zamowienia.models.Zamowienia;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import java.awt.print.Pageable;

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

		if (!StringUtils.isEmpty(szukajZamowieniaForm.getNazwaZamowienia())) {
			predicates.add(cb.equal(root.get("nazwaZamowienia"), szukajZamowieniaForm.getNazwaZamowienia()));
		}

		if (szukajZamowieniaForm.getIdZamowienia() != null) {
			predicates.add(cb.equal(root.get("idZamowienia"), szukajZamowieniaForm.getIdZamowienia()));
		}

		return cb.and(predicates.toArray(new Predicate[predicates.size()]));
	}
}