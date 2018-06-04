package com.fazlaysapaylas.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.fazlaysapaylas.domain.Kategori;
import com.fazlaysapaylas.service.KategoriService;

@ManagedBean(name="kategoriBean")
@SessionScoped
public class KategoriBean {

	private Kategori kategori=new Kategori();
	private List<Kategori> tumKategoriler;
	private List<Kategori> altKategoriler;
	//private String secilenKategori;
	//private String secilenAltKategori;
	
	private Long altKategoriId;
	private Long kategoriId;
	//private String kategoriAdi;
	
	
	
	
	
	public Long getAltKategoriId() {
		return altKategoriId;
	}

	public void setAltKategoriId(Long altKategoriId) {
		this.altKategoriId = altKategoriId;
	}

	
	
	
	public Long getKategoriId() {
		return kategoriId;
	}

	public void setKategoriId(Long kategoriId) {
		this.kategoriId = kategoriId;
	}




	@ManagedProperty(value="#{kategoriServiceImpl}")
	private KategoriService kategoriService;
		

	public void onload(){
		 tumKategoriler=new ArrayList<Kategori>();
		 tumKategoriler=kategoriService.tumUstKategorileriGetir();
		 //tumKategoriler=kategoriService.tumKategorileriGetir();
		 
	}
	
	public void kategoriDegisinceCalis(){
		if(kategoriId !=null && !kategoriId.equals("")){
		  altKategoriler=new ArrayList<Kategori>();
          altKategoriler = kategoriService.altKategorileriGetir(kategoriId);		
		}else{
			altKategoriler=new ArrayList<Kategori>();
		}
	}
	
    public KategoriBean(){		
		
	}

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
	
	
	public List<Kategori> getAltKategoriler() {
		return altKategoriler;
	}

	public void setAltKategoriler(List<Kategori> altKategoriler) {
		this.altKategoriler = altKategoriler;
	}



	
}
