package com.fazlaysapaylas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fazlaysapaylas.enums.UrunDurumu;

@Entity
public class Urun extends BaseEntityAudit {
	
	private Long id;
	private String tanim;
	private Kategori kategori;
	private Marka marka;
	private UrunDurumu kullanimDurumu;
	private String aciklama;
	private Integer puan; 	
	private byte[] fotograf;
	private Ilan ilan;
	
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="TANIM",nullable=false)
	public String getTanim() {
		return tanim;
	}
	public void setTanim(String tanim) {
		this.tanim = tanim;
	}
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="KATEGORI_ID")
	public Kategori getKategori() {
		return kategori;
	}
	public void setKategori(Kategori kategori) {
		this.kategori = kategori;
	}
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="MARKA_ID")
	public Marka getMarka(){
		return marka;
	}
	public void setMarka(Marka marka) {
		this.marka = marka;
	}
	@Column(name="KULLANIM_DURUMU")
	public UrunDurumu getKullanýmDurumu() {
		return kullanimDurumu;
	}
	public void setKullanýmDurumu(UrunDurumu kullanýmDurumu) {
		this.kullanimDurumu = kullanýmDurumu;
	}
	
	@Column(name="ACIKLAMA")
	public String getAciklama() {
		return aciklama;
	}
	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}
	
	@Column(name="PUAN")
	public Integer getPuan() {
		return puan;
	}
	public void setPuan(Integer puan) {
		this.puan = puan;
	}
	
	@Column(name="FOTOGRAF",columnDefinition="BLOB")
	public byte[] getFotograf() {
		return fotograf;
	}
	public void setFotograf(byte[] fotograf) {
		this.fotograf = fotograf;
	}
	
	@ManyToOne
	@JoinColumn(name="ILAN_ID", nullable=false)
	public Ilan getIlan() {
		return ilan;
	}
	public void setIlan(Ilan ilan) {
		this.ilan = ilan;
	}
	
	public Urun(){
		
	}
	public Urun(String tanim, Kategori kategori, Marka marka,
			UrunDurumu kullanýmDurumu, String aciklama, Integer puan,
			byte[] fotograf, Ilan ilan) {
		super();
		this.tanim = tanim;
		this.kategori = kategori;
		this.marka = marka;
		this.kullanimDurumu = kullanýmDurumu;
		this.aciklama = aciklama;
		this.puan = puan;
		this.fotograf = fotograf;
		this.ilan = ilan;
	}
	
	public Urun(String tanim, Kategori kategori, Marka marka,
			UrunDurumu kullanýmDurumu, String aciklama, Integer puan,
		    Ilan ilan) {

		this.tanim = tanim;
		this.kategori = kategori;
		this.marka = marka;
		this.kullanimDurumu = kullanýmDurumu;
		this.aciklama = aciklama;
		this.puan = puan;
		this.ilan = ilan;
	}


	
}
