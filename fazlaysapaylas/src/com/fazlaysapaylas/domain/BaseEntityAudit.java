package com.fazlaysapaylas.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public class BaseEntityAudit extends BaseEntity {

	private String kayitYapan;
	private Date kayitTarihi;
	private String degisiklikYapan;
	private Date degisiklikTarihi;		

	@Column(name="KAYIT_YAPAN")
	public String getKayitYapan() {
		return kayitYapan;
	}
	
	public void setKayitYapan(String kayitYapan) {
		this.kayitYapan = kayitYapan;
	}
	
	@Column(name="DEGISIKLIK_YAPAN")
	public String getDegisiklikYapan() {
		return degisiklikYapan;
	}
	
	public void setDegisiklikYapan(String degisiklikYapan) {
		this.degisiklikYapan = degisiklikYapan;
	}
	
	@Temporal(TemporalType.TIMESTAMP)  
	@Column(name="KAYIT_TARIHI")
	public Date getKayitTarihi() {
		return kayitTarihi;
	}
	
	public void setKayitTarihi(Date kayitTarihi) {
		this.kayitTarihi = kayitTarihi;
	}

	@Temporal(TemporalType.TIMESTAMP)  
	@Column(name="DEGISIKLIK_TARIHI")
	public Date getDegisiklikTarihi() {
		return degisiklikTarihi;
	}
	
	public void setDegisiklikTarihi(Date degisiklikTarihi) {
		this.degisiklikTarihi = degisiklikTarihi;
	}

}
