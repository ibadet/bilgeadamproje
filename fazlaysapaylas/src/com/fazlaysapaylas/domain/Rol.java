package com.fazlaysapaylas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rol extends BaseEntity {
	
	private Long id;
	private String rolAdi;
	private String rolKodu;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="ROL_ADI")
	public String getRolAdi() {
		return rolAdi;
	}
	public void setRolAdi(String rolAdi) {
		this.rolAdi = rolAdi;
	}
	@Column(name="ROL_KODU")
	public String getRolKodu() {
		return rolKodu;
	}
	public void setRolKodu(String rolKodu) {
		this.rolKodu = rolKodu;
	}
	
	public Rol(String rolAdi, String rolKodu) {
		super();
		this.rolAdi = rolAdi;
		this.rolKodu = rolKodu;
	}
	
	@Override
	public String toString() {
		return "Rol [rolAdi=" + rolAdi + ", rolKodu=" + rolKodu + "]";
	}
	
	

}
