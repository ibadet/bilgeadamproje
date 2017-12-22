package com.fazlaysapaylas.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.fazlaysapaylas.domain.Kategori;
import com.fazlaysapaylas.service.KategoriService;

@ManagedBean(name="kategoriBean")
@ViewScoped
public class KategoriBean {

	private Kategori kategori=new Kategori();
	private List<Kategori> tumKategoriler;
	
	@ManagedProperty(value="#{kategoriServiceImpl}")
	private KategoriService kategoriService;

	public Kategori getKategori() {
		return kategori;
	}

	public void setKategori(Kategori kategori) {
		this.kategori = kategori;
	}

	public KategoriService getKategoriService() {
		return kategoriService;
	}

	public void setKategoriService(KategoriService kategoriService) {
		this.kategoriService = kategoriService;
	}
	
	public List<Kategori> getTumKategoriler() {
		return tumKategoriler;
	}

	public void setTumKategoriler(List<Kategori> tumKategoriler) {
		this.tumKategoriler = tumKategoriler;
	}
	
	public void onload(){
		 tumKategoriler=new ArrayList<Kategori>();
		 tumKategoriler=kategoriService.tumKategorileriGetir();
	}
	
	public KategoriBean(){		
		
	}
}
