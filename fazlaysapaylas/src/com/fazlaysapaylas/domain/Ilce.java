package com.fazlaysapaylas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ilce {
	
	private Long id;
	private Il il;
	private String ilceAdi;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	public Il getIl() {
		return il;
	}
	public void setIl(Il il) {
		this.il = il;
	}
	
	@Column(name="ilce_adi")
	public String getIlceAdi() {
		return ilceAdi;
	}
	public void setIlceAdi(String ilceAdi) {
		this.ilceAdi = ilceAdi;
	}
	
	public Ilce(){
		
	}
	
	public Ilce(Il il, String ilceAdi) {
		super();
		this.il = il;
		this.ilceAdi = ilceAdi;
	}
	@Override
	public String toString() {
		return "Ilce [il=" + il + ", ilceAdi=" + ilceAdi + "]";
	}
	
	
	
	

}
