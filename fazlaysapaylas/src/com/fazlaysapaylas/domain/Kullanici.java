package com.fazlaysapaylas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity 
@Inheritance(strategy=InheritanceType.JOINED) 
@PrimaryKeyJoinColumn(name="KISI_ID")
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
	
	
	@Column(name="KULLANICI_ADI",unique=true)
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}
	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}	
	@Column(name="SIFRE")
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
		
	}
	public Kullanici(String kullaniciAdi, String sifre,	Rol kullaniciRol) {
		super();
		this.kullaniciAdi = kullaniciAdi;
		this.sifre = sifre;
		this.kullaniciRol = kullaniciRol;
	}

	
	

}
