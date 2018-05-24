package piotr.zamowienia.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import piotr.zamowienia.models.Zamowienia;

public interface ZamowieniaService {
	

	public List<Zamowienia> findAll();

	public void saveZamowienia(Zamowienia zamowienia);
	
	public Page<Zamowienia> findAllPages(Pageable pageable);
	
//	public Zamowienia findByIdZamowienia(int id);
	
//	public void updateZamowienia(Zamowienia zamowienia);

	//public Zamowienia findZamowieniadById(int idZamowienia);
	
	}
