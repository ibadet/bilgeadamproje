package com.fazlaysapaylas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fazlaysapaylas.dao.UrunDao;
import com.fazlaysapaylas.domain.Kategori;
import com.fazlaysapaylas.domain.Marka;
import com.fazlaysapaylas.domain.Urun;
import com.fazlaysapaylas.enums.UrunDurumu;

@Service
public class UrunServiceImpl implements UrunService {
	
	@Autowired
	private UrunDao urunDao;

	@Override
	public List<Urun> kategoriyeGoreUrunGetir(Kategori kategori) {
		return urunDao.kategoriyeGoreUrunGetir(kategori);
	}

	@Override
	public Urun markayaGoreUrunGetir(Marka marka) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Urun kullanimDurumunaGoreGetir(UrunDurumu kullanýmDurumu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean urunEkle(Urun urun) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean urunSil(Urun urun) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Urun urunGuncelle(Urun urun) {
		// TODO Auto-generated method stub
		return null;
	}

}
