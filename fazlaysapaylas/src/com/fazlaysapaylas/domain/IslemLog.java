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

import com.fazlaysapaylas.enums.IslemYeri;

@Entity
public class IslemLog extends BaseEntity {
	
	private Long id;
	private Date islemTarihi;
	private Kisi islemiYapan;
	private String aciklama;
	private IslemYeri islemYeri;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="ISLEM_TARIHI")
	public Date getIslemTarihi() {
		return islemTarihi;
	}
	public void setIslemTarihi(Date islemTarihi) {
		this.islemTarihi = islemTarihi;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	public Kisi getIslemiYapan() {
		return islemiYapan;
	}
	public void setIslemiYapan(Kisi islemiYapan) {
		this.islemiYapan = islemiYapan;
	}
	
	@Column(name="ACIKLAMA")
	public String getAciklama() {
		return aciklama;
	}
	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}	
	
	@Column(name="ISLEM_YERI")
	@Enumerated(EnumType.STRING)
	public IslemYeri getIslemYeri() {
		return islemYeri;
	}
	public void setIslemYeri(IslemYeri islemYeri) {
		this.islemYeri = islemYeri;
	}
	
	public IslemLog(){
		
	}

	public IslemLog(Date islemTarihi, Kisi islemiYapan, String aciklama,IslemYeri islemYeri) {
		super();
		this.islemTarihi = islemTarihi;
		this.islemiYapan = islemiYapan;
		this.aciklama = aciklama;
		this.islemYeri=islemYeri;
	}
	


}
