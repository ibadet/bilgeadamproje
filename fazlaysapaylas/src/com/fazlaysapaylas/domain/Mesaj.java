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

@Entity
public class Mesaj extends BaseEntity{
	
	private Long id;
	private Kisi gonderen;
	private Kisi alici;
	private Date gonderimTarihi;
	private String icerik;
	private String iletimDurumu;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="GONDEREN_ID")
	public Kisi getGonderen() {
		return gonderen;
	}
	public void setGonderen(Kisi gonderen) {
		this.gonderen = gonderen;
	}
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ALICI_ID")
	public Kisi getAlici() {
		return alici;
	}
	public void setAlici(Kisi alici) {
		this.alici = alici;
	}
	@Column(name="GONDERIM_TARIHI")
	public Date getGonderimTarihi() {
		return gonderimTarihi;
	}
	public void setGonderimTarihi(Date gonderimTarihi) {
		this.gonderimTarihi = gonderimTarihi;
	}
	
	@Column(name="ICERIK")
	public String getIcerik() {
		return icerik;
	}
	public void setIcerik(String icerik) {
		this.icerik = icerik;
	}
	@Column(name="ILETIM_DURUMU")
	public String getIletimDurumu() {
		return iletimDurumu;
	}
	public void setIletimDurumu(String iletimDurumu) {
		this.iletimDurumu = iletimDurumu;
	}
	
	public Mesaj(){
		
	}
	
	public Mesaj(Kisi gonderen, Kisi alici, Date gonderimTarihi, String icerik,
			String iletimDurumu) {
		super();
		this.gonderen = gonderen;
		this.alici = alici;
		this.gonderimTarihi = gonderimTarihi;
		this.icerik = icerik;
		this.iletimDurumu = iletimDurumu;
	}
	
	@Override
	public String toString() {
		return "Mesaj [id=" + id + ", gonderen=" + gonderen + ", alici="
				+ alici + ", gonderimTarihi=" + gonderimTarihi + ", icerik="
				+ icerik + ", iletimDurumu=" + iletimDurumu + "]";
	}
	
	
	

}
