package com.fazlaysapaylas.domain;

import java.util.Date;

public class Mesaj {
	
	private Long id;
	private Kisi gonderen;
	private Kisi alici;
	private Date gonderimTarihi;
	private String icerik;
	private String iletimDurumu;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Kisi getGonderen() {
		return gonderen;
	}
	public void setGonderen(Kisi gonderen) {
		this.gonderen = gonderen;
	}
	public Kisi getAlici() {
		return alici;
	}
	public void setAlici(Kisi alici) {
		this.alici = alici;
	}
	public Date getGonderimTarihi() {
		return gonderimTarihi;
	}
	public void setGonderimTarihi(Date gonderimTarihi) {
		this.gonderimTarihi = gonderimTarihi;
	}
	public String getIcerik() {
		return icerik;
	}
	public void setIcerik(String icerik) {
		this.icerik = icerik;
	}
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
