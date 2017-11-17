package com.fazlaysapaylas.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fazlaysapaylas.enums.IlanKaldirmaNedeni;
import com.fazlaysapaylas.enums.IlanOnayDurumu;
import com.fazlaysapaylas.enums.YayinDurumu;

@Entity
public class Ilan extends BaseEntity {
	
	private Long ilanNo;
	private Date ilanVerilisTarihi;
	private Date ilanKapanisTarihi;
	private YayinDurumu yayinDurumu;
	private IlanOnayDurumu onayDurumu;
	private IlanKaldirmaNedeni kaldirilmaNedeni;
	private Kisi ilaniVeren;
	//private Set<Urun> urunler;	
	private Urun urn;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ILAN_NO")
	public Long getIlanNo() {
		return ilanNo;
	}
	public void setIlanNo(Long ilanNo) {
		this.ilanNo = ilanNo;
	}
	
	@Column(name="ILAN_VERILIS_TARIHI")
	public Date getIlanVerilisTarihi() {
		return ilanVerilisTarihi;
	}
	public void setIlanVerilisTarihi(Date ilanVerilisTarihi) {
		this.ilanVerilisTarihi = ilanVerilisTarihi;
	}
	@Column(name="ILAN_KAPANIS_TARIHI")
	public Date getIlanKapanisTarihi() {
		return ilanKapanisTarihi;
	}
	public void setIlanKapanisTarihi(Date ilanKapanisTarihi) {
		this.ilanKapanisTarihi = ilanKapanisTarihi;
	}
	@Column(name="YAYIN_DURUMU")
	@Enumerated(EnumType.STRING)
	public YayinDurumu getYayinDurumu() {
		return yayinDurumu;
	}
	public void setYayinDurumu(YayinDurumu yayinDurumu) {
		this.yayinDurumu = yayinDurumu;
	}
	@Column(name="ONAY_DURUMU")
	@Enumerated(EnumType.STRING)
	public IlanOnayDurumu getOnayDurumu() {
		return onayDurumu;
	}
	public void setOnayDurumu(IlanOnayDurumu onayDurumu) {
		this.onayDurumu = onayDurumu;
	}
	@Column(name="KALDIRILMA_NEDENÝ")
	@Enumerated(EnumType.STRING)
	public IlanKaldirmaNedeni getKaldirilmaNedeni() {
		return kaldirilmaNedeni;
	}
	public void setKaldirilmaNedeni(IlanKaldirmaNedeni kaldirilmaNedeni) {
		this.kaldirilmaNedeni = kaldirilmaNedeni;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	public Kisi getIlaniVeren() {
		return ilaniVeren;
	}
	public void setIlaniVeren(Kisi ilaniVeren) {
		this.ilaniVeren = ilaniVeren;
	}
	
	/*
	@OneToMany(fetch=FetchType.LAZY)
	public Set<Urun> getUrunler() {
		return urunler;
	}
	public void setUrunler(Set<Urun> urunler) {
		this.urunler = urunler;
	}*/
	
	@OneToOne(fetch=FetchType.LAZY)
	public Urun getUrn() {
		return urn;
	}
	public void setUrn(Urun urun) {
		this.urn = urun;
	}	
	
	public Ilan(){
		
	}
	
	
	
	

}
