package com.fazlaysapaylas.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity  {
	
	private Long id;
	private Kullanici kayitYapan;
	private Date kayitTarihi;
	private Kullanici degisiklikYapan;
	private Date degisiklikTarihi;
		
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@ManyToOne(fetch=FetchType.EAGER)
	public Kullanici getKayitYapan() {
		return kayitYapan;
	}
	public void setKayitYapan(Kullanici kayitYapan) {
		this.kayitYapan = kayitYapan;
	}
	
	@Column(name="KAYIT_TARIHI")
	public Date getKayitTarihi() {
		return kayitTarihi;
	}
	public void setKayitTarihi(Date kayitTarihi) {
		this.kayitTarihi = kayitTarihi;
	}
	
	@ManyToOne(fetch=FetchType.EAGER)
	public Kullanici getDegisiklikYapan() {
		return degisiklikYapan;
	}
	public void setDegisiklikYapan(Kullanici degisiklikYapan) {
		this.degisiklikYapan = degisiklikYapan;
	}
	
	@Column(name="DEGISIKLIK_TARIHI")
	public Date getDegisiklikTarihi() {
		return degisiklikTarihi;
	}
	public void setDegisiklikTarihi(Date degisiklikTarihi) {
		this.degisiklikTarihi = degisiklikTarihi;
	}
	

	

}
