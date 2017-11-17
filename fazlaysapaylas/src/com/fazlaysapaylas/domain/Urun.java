package com.fazlaysapaylas.domain;

import java.util.Arrays;

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
public class Urun extends BaseEntity {
	
	private Long id;
	private String tanim;
	private Kategori kategori;
	private Marka marka;
	private UrunDurumu kullan�mDurumu;
	private String aciklama;
	private Integer puan; 
	private byte[] fotograf;
	
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
	public UrunDurumu getKullan�mDurumu() {
		return kullan�mDurumu;
	}
	public void setKullan�mDurumu(UrunDurumu kullan�mDurumu) {
		this.kullan�mDurumu = kullan�mDurumu;
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
	
	@Column(name="FOTOGRAF")
	public byte[] getFotograf() {
		return fotograf;
	}
	public void setFotograf(byte[] fotograf) {
		this.fotograf = fotograf;
	}
	
	public Urun(){
		
	}
	public Urun(String tanim, Kategori kategori, Marka marka,
			UrunDurumu kullan�mDurumu, String aciklama, Integer puan,
			byte[] fotograf) {
		super();
		this.tanim = tanim;
		this.kategori = kategori;
		this.marka = marka;
		this.kullan�mDurumu = kullan�mDurumu;
		this.aciklama = aciklama;
		this.puan = puan;
		this.fotograf = fotograf;
	}
	@Override
	public String toString() {
		return "Urun [id=" + id + ", tanim=" + tanim + ", kategori=" + kategori
				+ ", marka=" + marka + ", kullan�mDurumu=" + kullan�mDurumu
				+ ", aciklama=" + aciklama + ", puan=" + puan + ", fotograf="
				+ Arrays.toString(fotograf) + "]";
	}
	
	
	
	

}
