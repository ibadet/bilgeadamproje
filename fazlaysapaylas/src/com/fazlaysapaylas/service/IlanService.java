package com.fazlaysapaylas.service;

import java.util.List;

import com.fazlaysapaylas.domain.Ilan;
import com.fazlaysapaylas.domain.Kisi;
import com.fazlaysapaylas.enums.YayinDurumu;

public interface IlanService {
	
	public boolean ilanEkle(Ilan ilan);
	
	public boolean ilanSil(Ilan ilan);
	
	public boolean ilanGuncelle(Ilan ilan);
	
	public List<Ilan> yayinDurumunaGoreGetir(YayinDurumu yayinDurumu);
	
	public List<Ilan> ilaniVereneGoreGetir(Kisi ilaniVeren);

}
