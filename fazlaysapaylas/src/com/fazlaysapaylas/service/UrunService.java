package com.fazlaysapaylas.service;

import java.util.List;

import com.fazlaysapaylas.domain.Kategori;
import com.fazlaysapaylas.domain.Marka;
import com.fazlaysapaylas.domain.Urun;
import com.fazlaysapaylas.enums.UrunDurumu;

public interface UrunService {
	
public List<Urun> kategoriyeGoreUrunGetir(Kategori kategori);
	
	public Urun markayaGoreUrunGetir(Marka marka);
	
	public Urun kullanimDurumunaGoreGetir(UrunDurumu kullanýmDurumu);
	
	public boolean urunEkle(Urun urun);
	
	public boolean urunSil(Urun urun);
	
	public Urun urunGuncelle(Urun urun);


}
