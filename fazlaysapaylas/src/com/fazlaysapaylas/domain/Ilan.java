package com.fazlaysapaylas.domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fazlaysapaylas.enums.IlanKaldirmaNedeni;
import com.fazlaysapaylas.enums.IlanOnayDurumu;
import com.fazlaysapaylas.enums.YayinDurumu;

@Entity
public class Ilan extends BaseEntityAudit {
	
	private Long id;
	private Long ilanNo;
	private Date ilanVerilisTarihi;
	private Date ilanKapanisTarihi;
	private YayinDurumu yayinDurumu;
	private IlanOnayDurumu onayDurumu;
	private IlanKaldirmaNedeni kaldirilmaNedeni;
	private Kisi ilaniVeren;
	private Set<Urun> urunler;	
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

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
	@Column(name="KALDIRILMA_NEDENI")
	@Enumerated(EnumType.STRING)
	public IlanKaldirmaNedeni getKaldirilmaNedeni() {
		return kaldirilmaNedeni;
	}
	public void setKaldirilmaNedeni(IlanKaldirmaNedeni kaldirilmaNedeni) {
		this.kaldirilmaNedeni = kaldirilmaNedeni;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ILANIVEREN_ID")
	public Kisi getIlaniVeren() {
		return ilaniVeren;
	}
	public void setIlaniVeren(Kisi ilaniVeren) {
		this.ilaniVeren = ilaniVeren;
	}
	
	
	@OneToMany(mappedBy="ilan", fetch=FetchType.LAZY)
	public Set<Urun> getUrunler() {
		return urunler;
	}
	public void setUrunler(Set<Urun> urunler) {
		this.urunler = urunler;
	}
	
	
	public Ilan(){
		
	}
	
	
	
	

}
