package com.fazlaysapaylas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Marka {
	
	private Long id;
	private String markaAdi;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="marka_adi")
	public String getMarkaAdi() {
		return markaAdi;
	}
	public void setMarkaAdi(String markaAdi) {
		this.markaAdi = markaAdi;
	}
	
	public Marka(){
		
	}
	
	public Marka(String markaAdi) {
		super();
		this.markaAdi = markaAdi;
	}
	
	

}
