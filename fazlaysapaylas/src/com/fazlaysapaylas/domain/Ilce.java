package com.fazlaysapaylas.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ilce extends BaseEntityAudit {
	
	private Long id;
	private Il il;
	private String ilceAdi;
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@ManyToOne(fetch=FetchType.LAZY,cascade={CascadeType.ALL})
	@JoinColumn(name="IL_ID")
	public Il getIl() {
		return il;
	}
	public void setIl(Il il) {
		this.il = il;
	}
	
	@Column(name="ILCE_ADI")
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
