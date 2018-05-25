package piotr.zamowienia.controllers;

import java.awt.print.Pageable;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.ws.rs.GET;
import javax.ws.rs.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ResourceNotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import piotr.zamowienia.models.SzukajZamowieniaForm;
import piotr.zamowienia.models.Zamowienia;
import piotr.zamowienia.repository.ZamowieniaRepository;
//import piotr.zamowienia.repository.ZamowieniaSearch;
import piotr.zamowienia.repository.ZamowieniaSpecifications;
import piotr.zamowienia.service.ZamowieniaService;

@Controller
public class ZamowieniaController {

	@Autowired
	ZamowieniaService zamowieniaService;

	@Autowired
	ZamowieniaRepository zamowieniaRepository;

	@GET
	@RequestMapping(value = "/zamowienia")
	@Secured(value = { "ROLE_ADMIN", "ROLE_USER" })
	public String showZamowieniaPage(Model model) {
		List<Zamowienia> zamowieniaList = zamowieniaService.findAll();
		model.addAttribute("zamowieniaList", zamowieniaList);
		return "zamowienia";
	}

	@GET
	@RequestMapping(value = "/zamowienia/{page}")
	@Secured(value = { "ROLE_ADMIN", "ROLE_USER" })
	public String showZamowieniaPageable(@PathVariable("page") int page, Model model) {
		int elements = 2;
		Page<Zamowienia> pages = zamowieniaService.findAllPages(new PageRequest(page, elements));
		int totalPages = pages.getTotalPages();
		int currentPage = pages.getNumber();
		List<Zamowienia> zamowieniaList = pages.getContent();
		model.addAttribute("szukajZamowieniaForm", new SzukajZamowieniaForm());
		model.addAttribute("zamowieniaList", zamowieniaList);
		model.addAttribute("totalPages", totalPages);
		model.addAttribute("currentPage", currentPage);
		return "zamowienia";
	}

	@GET
	@RequestMapping(value = "/nowezamowienie")
	@Secured(value = { "ROLE_ADMIN", "ROLE_USER" })
	public String noweZamowienie(Model model, Principal principal) {
		Zamowienia zamowienia = new Zamowienia();
		java.sql.Date sql = new java.sql.Date(new java.util.Date().getTime());

		zamowienia.setEmailUser(principal.getName());
		zamowienia.setDataZamowienia(sql);
		zamowienia.setStatus("Dodano zamówienie");
		model.addAttribute("zamowienia", zamowienia);
		return "nowezamowienie";
	}

	@RequestMapping(value = "/searchZamowienia", method = RequestMethod.POST)
	@Secured(value = { "ROLE_ADMIN", "ROLE_USER" })
	public String searchZamowienia(SzukajZamowieniaForm szukajZamowieniaForm, Model model) {
		ZamowieniaSpecifications zamowieniaSpecifications = new ZamowieniaSpecifications(szukajZamowieniaForm);
		List<Zamowienia> zamowienia = zamowieniaRepository.findAll(zamowieniaSpecifications);
		model.addAttribute("zamowieniaList", zamowienia);
		return "zamowienia";
	}

	@GET
	@PutMapping(value = "/zamowienia/edit/{id}")
	@Secured(value = { "ROLE_ADMIN" })
	public String updateZamowienia(@PathVariable("id") Integer id, @RequestBody Zamowienia zamowienia, Model model) {

		java.sql.Date sql = new java.sql.Date(new java.util.Date().getTime());
		zamowienia = zamowieniaRepository.findByIdZamowienia(id);

		Integer.parseInt("idZamowienia");

		zamowienia.setDataPrzyjecia(sql);
		zamowienia.setStatus("zrealizowano");

		zamowieniaRepository.save(zamowienia);
		return "zamowienia";
	}

	@POST
	@RequestMapping(value = "/addzam")
	@Secured(value = { "ROLE_ADMIN", "ROLE_USER" })
	public String zapiszZamowienie(Model model, @Valid Zamowienia zamowienia, BindingResult result) {
		String strona = null;

		zamowieniaService.saveZamowienia(zamowienia);
		int elements = 10;
		int page = 0;
		Page<Zamowienia> pages = zamowieniaService.findAllPages(new PageRequest(page, elements));
		int totalPages = pages.getTotalPages();
		int currentPage = pages.getNumber();
		List<Zamowienia> zamowieniaList = pages.getContent();
		model.addAttribute("zamowieniaList", zamowieniaList);
		model.addAttribute("totalPages", totalPages);
		model.addAttribute("currentPage", currentPage);
		strona = "zamowienia";
		return strona;
	}

	@GET
	@RequestMapping(value = "/sortujZamowienia/{poczymsortowac}/{kierunek}")
	public String sortujZamowienia(@PathVariable("poczymsortowac") String poCzymStortowac, @PathVariable("kierunek") String kierunek, Model model) {

		List<Zamowienia> zamowieniaList = new ArrayList<>();

		if (kierunek != null && kierunek.equalsIgnoreCase("DESC")) {
			switch (poCzymStortowac) {
				case "idZamowienia":
					zamowieniaList = zamowieniaRepository.findAllByOrderByIdZamowieniaDesc();
					break;
				case "nazwaZamowienia":
					zamowieniaList = zamowieniaRepository.findAllByOrderByIdZamowieniaDesc();
					break;
			}
		} else if (kierunek != null && kierunek.equalsIgnoreCase("ASC")) {
			switch (poCzymStortowac) {
				case "idZamowienia":
					zamowieniaList = zamowieniaRepository.findAllByOrderByIdZamowieniaAsc();
			}

		}

		model.addAttribute("zamowieniaList", zamowieniaList);
		model.addAttribute("szukajZamowieniaForm", new SzukajZamowieniaForm());
		return "zamowienia";

	}

}
