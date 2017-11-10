package com.fazlaysapaylas.domain;

public class Yetki {
	
	private Long id;
	private String yetkiAdi;
	private String yetkiKodu;
	private Rol rol;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getYetkiAdi() {
		return yetkiAdi;
	}
	public void setYetkiAdi(String yetkiAdi) {
		this.yetkiAdi = yetkiAdi;
	}
	public String getYetkiKodu() {
		return yetkiKodu;
	}
	public void setYetkiKodu(String yetkiKodu) {
		this.yetkiKodu = yetkiKodu;
	}
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
	public Yetki(){
		
	}
	
	public Yetki(String yetkiAdi, String yetkiKodu, Rol rol) {
		super();
		this.yetkiAdi = yetkiAdi;
		this.yetkiKodu = yetkiKodu;
		this.rol = rol;
	}
	@Override
	public String toString() {
		return "Yetki [yetkiAdi=" + yetkiAdi + ", yetkiKodu=" + yetkiKodu
				+ ", rol=" + rol + "]";
	}
	
	

}
