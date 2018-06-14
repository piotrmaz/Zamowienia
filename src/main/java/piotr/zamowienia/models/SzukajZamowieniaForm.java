package piotr.zamowienia.models;

import java.sql.Date;

public class SzukajZamowieniaForm {

	private String nazwaZamowienia;

	private Integer idZamowienia;

		
		private String emailUser;
//		
//		private Date dataZamowienia;
//		
//		private String status;
	

	public String getNazwaZamowienia() {
		return nazwaZamowienia;
	}

	public void setNazwaZamowienia(String nazwaZamowienia) {
		this.nazwaZamowienia = nazwaZamowienia;
	}

	public Integer getIdZamowienia() {
		return idZamowienia;
	}

	public void setIdZamowienia(Integer idZamowienia) {
		this.idZamowienia = idZamowienia;
	}


		public String getEmailUser() {
			return emailUser;
		}
	
		public void setEmailUser(String emailUser) {
			this.emailUser = emailUser;
		}
	
//		public Date getDataZamowienia() {
//			return dataZamowienia;
//		}
//	
//		public void setDataZamowienia(Date dataZamowienia) {
//			this.dataZamowienia = dataZamowienia;
//		}
//	
//		public String getStatus() {
//			return status;
//		}
//	
//		public void setStatus(String status) {
//			this.status = status;
//		}
//		
		

}
