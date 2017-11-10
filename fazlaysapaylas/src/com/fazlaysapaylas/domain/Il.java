package com.fazlaysapaylas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Il {
	
	private Long id;
	private String ilKodu;
	private String ilAdi;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="il_kodu")
	public String getIlKodu() {
		return ilKodu;
	}
	public void setIlKodu(String ilKodu) {
		this.ilKodu = ilKodu;
	}
	
	@Column(name="il_adi")
	public String getIlAdi() {
		return ilAdi;
	}
	public void setIlAdi(String ilAdi) {
		this.ilAdi = ilAdi;
	}
	
	
	public Il(){		
	}
	
	public Il(String ilKodu, String ilAdi) {
		super();
		this.ilKodu = ilKodu;
		this.ilAdi = ilAdi;
	}
	
	@Override
	public String toString() {
		return "Il [ilKodu=" + ilKodu + ", ilAdi=" + ilAdi + "]";
	}
	
	

}
