package com.fazlaysapaylas.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Yetki", uniqueConstraints = {
		@UniqueConstraint(columnNames = "YETKI_ADI"),
		@UniqueConstraint(columnNames = "YETKI_KODU") })
public class Yetki extends BaseEntity {
	
	private Long id;
	private String yetkiAdi;
	private String yetkiKodu;
	private Set<Rol> roller;
		

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="YETKI_ADI")
	public String getYetkiAdi() {
		return yetkiAdi;
	}
	public void setYetkiAdi(String yetkiAdi) {
		this.yetkiAdi = yetkiAdi;
	}
	@Column(name="YETKI_KODU")
	public String getYetkiKodu() {
		return yetkiKodu;
	}
	public void setYetkiKodu(String yetkiKodu) {
		this.yetkiKodu = yetkiKodu;
	}
	
	
	@ManyToMany(fetch=FetchType.LAZY,mappedBy="yetkiler")
	public Set<Rol> getRoller() {
		return roller;
	}
	public void setRoller(Set<Rol> roller) {
		this.roller = roller;
	}
	
	public Yetki(){
		
	}
	public Yetki(String yetkiAdi, String yetkiKodu) {
		super();
		this.yetkiAdi = yetkiAdi;
		this.yetkiKodu = yetkiKodu;
		roller=new HashSet<Rol>();
	}
	
	public void rolEkle(Rol rol){
		this.roller.add(rol);
	}

}
