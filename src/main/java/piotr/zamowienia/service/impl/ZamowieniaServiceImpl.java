package piotr.zamowienia.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import piotr.zamowienia.models.Zamowienia;
import piotr.zamowienia.repository.ZamowieniaRepository;
//import piotr.zamowienia.repository.ZamowieniaSpecifications;
import piotr.zamowienia.service.ZamowieniaService;

@Service("zamowieniaService")
@Transactional
public class ZamowieniaServiceImpl implements ZamowieniaService{

	@Autowired
	ZamowieniaRepository zamowieniaRepository;
	

	@Override
	public List<Zamowienia> findAll() {
		List<Zamowienia> zamowieniaList = zamowieniaRepository.findAll();
		return zamowieniaList;
	}



	@Override
	public void saveZamowienia(Zamowienia zamowienia) {
		
			
		zamowienia.setEmailUser(zamowienia.getEmailUser());
		zamowienia.setIdZamowienia(zamowienia.getIdZamowienia());
		zamowienia.setDataZamowienia(zamowienia.getDataZamowienia());
		zamowienia.setNazwaZamowienia(zamowienia.getNazwaZamowienia());
		zamowienia.setIloscZamowienia(zamowienia.getIloscZamowienia());
		zamowienia.setPowodZamowienia(zamowienia.getPowodZamowienia());
		zamowienia.setDataPrzyjecia(zamowienia.getDataPrzyjecia());
		zamowienia.setStatus(zamowienia.getStatus());
		
		zamowieniaRepository.save(zamowienia); 
		
		
	}
	/*
	@Override
	public void updateZamowienia(Zamowienia zamowienia) {
		
		zamowieniaRepository.findZamowieniaById(id);
		zamowienia.setDataPrzyjecia(zamowienia.getDataPrzyjecia());
		zamowienia.setStatus(zamowienia.getStatus());
		
		zamowieniaRepository.save(zamowienia);
		
		
	}
*/
	@Override
	public Page<Zamowienia> findAllPages(Pageable pageable) {
		Page<Zamowienia> pages = zamowieniaRepository.findAll(pageable);
		return pages;
	}



	@Override
	public Zamowienia findByIdZamowienia(int idZamowienia) {
	
		return zamowieniaRepository.findByIdZamowienia(idZamowienia);
	}


/*
	@Override
	public Zamowienia findByIdZamowienia(int id) {
		return zamowieniaRepository.findByIdZamowienia(id);
		}
 


	@Override
	public void updateZamowienia(Zamowienia zamowienia) {
		zamowieniaRepository.save(zamowienia);
		
	}
 
*/
 

//	@Override
//	public Zamowienia findZamowieniadById(int idZamowienia) {
//		return (Zamowienia) ZamowieniaSpecifications.idZamowienia(idZamowienia);
//	}


}
