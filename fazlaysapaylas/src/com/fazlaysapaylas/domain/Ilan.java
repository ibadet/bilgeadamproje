package com.fazlaysapaylas.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fazlaysapaylas.enums.IlanKaldirmaNedeni;
import com.fazlaysapaylas.enums.IlanOnayDurumu;
import com.fazlaysapaylas.enums.YayinDurumu;

@Entity
public class Ilan {
	
	private Long ilanNo;
	private Date ilanVerilisTarihi;
	private Date ilanKapanisTarihi;
	private YayinDurumu yayinDurumu;
	private IlanOnayDurumu onayDurumu;
	private IlanKaldirmaNedeni kaldirilmaNedeni;
	private Kisi ilaniVeren;
	private Urun urun;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ilan_no")
	public Long getIlanNo() {
		return ilanNo;
	}
	public void setIlanNo(Long ilanNo) {
		this.ilanNo = ilanNo;
	}
	
	@Column(name="ilan_verilis_tarihi")
	public Date getIlanVerilisTarihi() {
		return ilanVerilisTarihi;
	}
	public void setIlanVerilisTarihi(Date ilanVerilisTarihi) {
		this.ilanVerilisTarihi = ilanVerilisTarihi;
	}
	@Column(name="ilan_kapanis_tarihi")
	public Date getIlanKapanisTarihi() {
		return ilanKapanisTarihi;
	}
	public void setIlanKapanisTarihi(Date ilanKapanisTarihi) {
		this.ilanKapanisTarihi = ilanKapanisTarihi;
	}
	@Column(name="yayin_durumu")
	public YayinDurumu getYayinDurumu() {
		return yayinDurumu;
	}
	public void setYayinDurumu(YayinDurumu yayinDurumu) {
		this.yayinDurumu = yayinDurumu;
	}
	@Column(name="onay_durumu")
	public IlanOnayDurumu getOnayDurumu() {
		return onayDurumu;
	}
	public void setOnayDurumu(IlanOnayDurumu onayDurumu) {
		this.onayDurumu = onayDurumu;
	}
	@Column(name="kaldirilma_nedeni")
	public IlanKaldirmaNedeni getKaldirilmaNedeni() {
		return kaldirilmaNedeni;
	}
	public void setKaldirilmaNedeni(IlanKaldirmaNedeni kaldirilmaNedeni) {
		this.kaldirilmaNedeni = kaldirilmaNedeni;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id")
	public Kisi getIlaniVeren() {
		return ilaniVeren;
	}
	public void setIlaniVeren(Kisi ilaniVeren) {
		this.ilaniVeren = ilaniVeren;
	}
	
	@OneToOne(fetch=FetchType.LAZY)
	public Urun getUrun() {
		return urun;
	}
	public void setUrun(Urun urun) {
		this.urun = urun;
	}
	
	public Ilan(){
		
	}
	
	public Ilan(Date ilanVerilisTarihi, Date ilanKapanisTarihi,
			YayinDurumu yayinDurumu, IlanOnayDurumu onayDurumu, IlanKaldirmaNedeni kaldirilmaNedeni,
			Kisi ilaniVeren, Urun urun) {
		super();
		this.ilanVerilisTarihi = ilanVerilisTarihi;
		this.ilanKapanisTarihi = ilanKapanisTarihi;
		this.yayinDurumu = yayinDurumu;
		this.onayDurumu = onayDurumu;
		this.kaldirilmaNedeni = kaldirilmaNedeni;
		this.ilaniVeren = ilaniVeren;
		this.urun = urun;
	}
	@Override
	public String toString() {
		return "Ilan [ilanNo=" + ilanNo + ", ilanVerilisTarihi="
				+ ilanVerilisTarihi + ", ilanKapanisTarihi="
				+ ilanKapanisTarihi + ", yayinDurumu=" + yayinDurumu
				+ ", onayDurumu=" + onayDurumu + ", kaldirilmaNedeni="
				+ kaldirilmaNedeni + ", ilaniVeren=" + ilaniVeren + ", urun="
				+ urun + "]";
	}
	
	
	

}
