package com.fazlaysapaylas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Yetki extends BaseEntity {
	
	private Long id;
	private String yetkiAdi;
	private String yetkiKodu;
	private Rol rol;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="YETKI_ADI")
	public String getYetkiAdi() {
		return yetkiAdi;
	}
	public void setYetkiAdi(String yetkiAdi) {
		this.yetkiAdi = yetkiAdi;
	}
	@Column(name="YETKI_KODU")
	public String getYetkiKodu() {
		return yetkiKodu;
	}
	public void setYetkiKodu(String yetkiKodu) {
		this.yetkiKodu = yetkiKodu;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
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
