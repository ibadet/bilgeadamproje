package com.fazlaysapaylas.domain;

import java.util.Date;

public class IslemLog {
	
	private Long id;
	private Date islemTarihi;
	private Kisi islemiYapan;
	private String aciklama;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getIslemTarihi() {
		return islemTarihi;
	}
	public void setIslemTarihi(Date islemTarihi) {
		this.islemTarihi = islemTarihi;
	}
	public Kisi getIslemiYapan() {
		return islemiYapan;
	}
	public void setIslemiYapan(Kisi islemiYapan) {
		this.islemiYapan = islemiYapan;
	}
	public String getAciklama() {
		return aciklama;
	}
	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}
	
	public IslemLog(){
		
	}

	public IslemLog(Date islemTarihi, Kisi islemiYapan, String aciklama) {
		super();
		this.islemTarihi = islemTarihi;
		this.islemiYapan = islemiYapan;
		this.aciklama = aciklama;
	}
	
	@Override
	public String toString() {
		return "IslemLog [id=" + id + ", islemTarihi=" + islemTarihi
				+ ", islemiYapan=" + islemiYapan + ", aciklama=" + aciklama
				+ "]";
	} 
	
	
	

}
