package com.fazlaysapaylas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
//@DiscriminatorValue("kullanici")  
public class Kullanici extends Kisi {
	
	private Long Id;
	private String kullaniciAdi;
	private String sifre;
	private Rol kullaniciRol;
	
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

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="KULLANICI_ROL")
	public Rol getKullaniciRol() {
		return kullaniciRol;
	}
	public void setKullaniciRol(Rol kullaniciRol) {
		this.kullaniciRol = kullaniciRol;
	}
	
	public Kullanici() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}
