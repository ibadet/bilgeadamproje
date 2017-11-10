package com.fazlaysapaylas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Kategori {
	
	private Long id;
	private String kategoriAdi;
	private String kategoriKodu;
	private Kategori ustKategori;
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="kategori_adi")
	public String getKategoriAdi() {
		return kategoriAdi;
	}
	public void setKategoriAdi(String kategoriAdi) {
		this.kategoriAdi = kategoriAdi;
	}
	@Column(name="kategori_kodu")
	public String getKategoriKodu() {
		return kategoriKodu;
	}
	public void setKategoriKodu(String kategoriKodu) {
		this.kategoriKodu = kategoriKodu;
	}	
	
	@ManyToOne(fetch=FetchType.LAZY)
	public Kategori getUstKategori() {
		return ustKategori;
	}
	public void setUstKategori(Kategori ustKategori) {
		this.ustKategori = ustKategori;
	}
	public Kategori(){
		
	}
	public Kategori(String kategoriAdi, String kategoriKodu,
			Kategori ustKategori) {
		super();
		this.kategoriAdi = kategoriAdi;
		this.kategoriKodu = kategoriKodu;
		this.ustKategori = ustKategori;
	}
	@Override
	public String toString() {
		return "Kategori [kategoriAdi=" + kategoriAdi + ", kategoriKodu="
				+ kategoriKodu + ", ustKategori=" + ustKategori + "]";
	}
	
	
	
	

}
