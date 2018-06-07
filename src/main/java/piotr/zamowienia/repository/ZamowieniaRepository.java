package piotr.zamowienia.repository;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import piotr.zamowienia.models.Zamowienia;


@Repository
public interface ZamowieniaRepository extends JpaRepository<Zamowienia, Long>, JpaSpecificationExecutor<Zamowienia> {
	

	public Zamowienia findByIdZamowienia(Integer id);
	
	public List<Zamowienia> findAllByOrderByIdZamowieniaDesc();
	
	public List<Zamowienia> findAllByOrderByIdZamowieniaAsc();

//	public Zamowienia findOne(int id);

//	public void findOne(String id);
	

}