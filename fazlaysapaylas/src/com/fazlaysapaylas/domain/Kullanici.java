package com.fazlaysapaylas.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("kullanici")  
public class Kullanici extends Kisi {
	
	private Long Id;
	private String kullaniciAdi;
	private String sifre;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	@Column(name="KULLANICI_ADI",unique=true, nullable=false)
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}
	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}	
	@Column(name="SIFRE",nullable=false)
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	public Kullanici() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}
