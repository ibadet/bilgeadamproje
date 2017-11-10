package com.fazlaysapaylas.domain;

public class Rol {
	
	private Long id;
	private String rolAdi;
	private String rolKodu;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRolAdi() {
		return rolAdi;
	}
	public void setRolAdi(String rolAdi) {
		this.rolAdi = rolAdi;
	}
	public String getRolKodu() {
		return rolKodu;
	}
	public void setRolKodu(String rolKodu) {
		this.rolKodu = rolKodu;
	}
	
	public Rol(String rolAdi, String rolKodu) {
		super();
		this.rolAdi = rolAdi;
		this.rolKodu = rolKodu;
	}
	
	@Override
	public String toString() {
		return "Rol [rolAdi=" + rolAdi + ", rolKodu=" + rolKodu + "]";
	}
	
	

}
