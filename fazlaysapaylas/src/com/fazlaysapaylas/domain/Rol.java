package com.fazlaysapaylas.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Rol", uniqueConstraints = {
		@UniqueConstraint(columnNames = "ROL_ADI"),
		@UniqueConstraint(columnNames = "ROL_KODU") })
public class Rol extends BaseEntityAudit {
	
	private Long id;
	private String rolAdi;
	private String rolKodu;
	private Set<Yetki> yetkiler;
	
	
	public void yetkiEkle(Yetki yetki){
		this.yetkiler.add(yetki);
	}
	
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
	
	@ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinTable(name = "Rol_Yetki", joinColumns = {
			@JoinColumn(name = "ROL_ID") },
			inverseJoinColumns = { @JoinColumn(name = "YETKI_ID") })
	public Set<Yetki> getYetkiler() {
		return yetkiler;
	}
	public void setYetkiler(Set<Yetki> yetkiler) {
		this.yetkiler = yetkiler;
	}
	
	
	
	
	public Rol() {
	}

	public Rol(String rolAdi, String rolKodu) {
		super();
		this.rolAdi = rolAdi;
		this.rolKodu = rolKodu;
		yetkiler=new HashSet<Yetki>();
	}
	

	

}
