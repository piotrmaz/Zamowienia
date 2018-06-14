package piotr.zamowienia.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

//
//import org.hibernate.search.annotations.Field;
//import org.hibernate.search.annotations.Indexed;

import org.springframework.security.core.Authentication;

@Entity
//@Indexed
@Table(name = "zamowienia")
public class Zamowienia {


//	@Field
	//@Field

	@Column(name ="email_user")
	@NotNull(message = "Musisz podać swój adres email")
	private String emailUser;
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_zamowienia_seq")
	@SequenceGenerator(name="id_zamowienia_seq", sequenceName="id_zamowienia_seq", allocationSize=1)
	@Column(name = "id_zamowienia")
	private int idZamowienia;
	
	//@Field
	@Column(name = "data_zamowienia")
	@NotNull
	private Date dataZamowienia;
	
	//@Field
	@Column(name = "nazwa_zamowienia")
	@NotNull(message = "Musisz podać nazwę zamówienia")
	private String nazwaZamowienia;
	
	//@Field
	@Column(name = "ilosc_zamowienia")
	@NotNull(message = "Musisz podać ilość zamówienia")
	private int iloscZamowienia;
	
	//@Field
	@Column(name = "powod_zamowienia")
	@NotNull(message = "Musisz pogać powód zamówienia")
	private String powodZamowienia;
	
	//@Field
	@Column(name = "data_przyjecia")
	private Date dataPrzyjecia;
	
	//@Field
	@Column(name = "status")
	@NotNull
	private String status;
	
	@Transient
	private String operacja;
	

	public int getIdZamowienia() {
		return idZamowienia;
	}

	public void setIdZamowienia(int idZamowienia) {
		this.idZamowienia = idZamowienia;
	}

	public Date getDataZamowienia() {
		return dataZamowienia;
	}

	public void setDataZamowienia(Date dataZamowienia) {
		this.dataZamowienia = dataZamowienia;
	}

	public String getNazwaZamowienia() {
		return nazwaZamowienia;
	}

	public void setNazwaZamowienia(String nazwaZamowienia) {
		this.nazwaZamowienia = nazwaZamowienia;
	}

	public int getIloscZamowienia() {
		return iloscZamowienia;
	}

	public void setIloscZamowienia(int iloscZamowienia) {
		this.iloscZamowienia = iloscZamowienia;
	}

	public String getPowodZamowienia() {
		return powodZamowienia;
	}

	public void setPowodZamowienia(String powodZamowienia) {
		this.powodZamowienia = powodZamowienia;
	}

	public Date getDataPrzyjecia() {
		return dataPrzyjecia;
	}

	public void setDataPrzyjecia(Date dataPrzyjecia) {
		this.dataPrzyjecia = dataPrzyjecia;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOperacja() {
		return operacja;
	}

	public void setOperacja(String operacja) {
		this.operacja = operacja;
	}
	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	public void setEmailUser(Authentication authentication, String emailUser) {
		this.emailUser = emailUser;
		
	}

	public Zamowienia orElseThrow(Object object) {
		// TODO Auto-generated method stub
		return null;
	}


	
}