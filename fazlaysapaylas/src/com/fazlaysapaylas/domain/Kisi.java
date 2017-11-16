package com.fazlaysapaylas.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity  
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)  
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)  
@DiscriminatorValue(value="kisi")
public class Kisi extends BaseEntity {
	
	private Long id;
	private String ad;
	private String soyad;
	private String cepTelefonu;
	private String epostaAdresi;
	private Date dogumTarihi;
	private Il yasadigiIl;
	private Ilce yasadigiIlce;
	private String Adres;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}	
	@Column(name="AD")
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}	
	@Column(name="SOYAD")
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	@Column(name="CEP_TELEFONU")
	public String getCepTelefonu() {
		return cepTelefonu;
	}
	public void setCepTelefonu(String cepTelefonu) {
		this.cepTelefonu = cepTelefonu;
	}
	@Column(name="EPOSTA_ADRESI")
	public String getEpostaAdresi() {
		return epostaAdresi;
	}
	public void setEpostaAdresi(String epostaAdresi) {
		this.epostaAdresi = epostaAdresi;
	}
	@Column(name="DOGUM_TARIHI")
	public Date getDogumTarihi() {
		return dogumTarihi;
	}
	public void setDogumTarihi(Date dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	@ManyToOne(fetch=FetchType.LAZY)
	public Il getYasadigiIl() {
		return yasadigiIl;
	}
	public void setYasadigiIl(Il yasadigiIl) {
		this.yasadigiIl = yasadigiIl;
	}
	@ManyToOne(fetch=FetchType.LAZY)
	public Ilce getYasadigiIlce() {
		return yasadigiIlce;
	}
	public void setYasadigiIlce(Ilce yasadigiIlce) {
		this.yasadigiIlce = yasadigiIlce;
	}	
	@Column(name="ADRES")
	public String getAdres() {
		return Adres;
	}
	public void setAdres(String adres) {
		Adres = adres;
	}
	
	public Kisi(){
		
	}
	public Kisi(String ad, String soyad, String cepTelefonu,
			String epostaAdresi, Date dogumTarihi, Il yasadigiIl,
			Ilce yasadigiIlce, String adres) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.cepTelefonu = cepTelefonu;
		this.epostaAdresi = epostaAdresi;
		this.dogumTarihi = dogumTarihi;
		this.yasadigiIl = yasadigiIl;
		this.yasadigiIlce = yasadigiIlce;
		Adres = adres;
	}
	@Override
	public String toString() {
		return "Kisi [ad=" + ad + ", soyad=" + soyad + ", cepTelefonu="
				+ cepTelefonu + ", epostaAdresi=" + epostaAdresi
				+ ", dogumTarihi=" + dogumTarihi + ", yasadigiIl=" + yasadigiIl
				+ ", yasadigiIlce=" + yasadigiIlce + ", Adres=" + Adres + "]";
	}
	
	
	
	

}
