package com.fazlaysapaylas.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("kullanici")  
public class Kullanici extends Kisi {
	
	private String kullaniciAdi;
	private String sifre;
	
	
	@Column(name="kullanici_adi",unique=true, nullable=false)
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}
	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}
	
	@Column(name="sifre",nullable=false)
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
	public Kullanici(String ad, String soyad, String cepTelefonu,
			String epostaAdresi, Date dogumTarihi, Il yasadigiIl,
			Ilce yasadigiIlce, String adres, String kullaniciAdi, String sifre) {
		
		super(ad, soyad, cepTelefonu, epostaAdresi, dogumTarihi, yasadigiIl,
				yasadigiIlce, adres);		
		this.kullaniciAdi=kullaniciAdi;
		this.sifre=sifre;
	}
	
	

}
