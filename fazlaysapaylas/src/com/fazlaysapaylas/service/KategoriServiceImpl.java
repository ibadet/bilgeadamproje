 package com.fazlaysapaylas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fazlaysapaylas.dao.KategoriDao;
import com.fazlaysapaylas.domain.Kategori;

@Service
public class KategoriServiceImpl implements KategoriService {

	@Autowired
	private KategoriDao kategoriDao;	
			
	@Override
	public List<Kategori> altKategorileriGetir(Kategori ustKategori) {		
		return kategoriDao.altKategorileriGetir(ustKategori);
	}

	@Override
	public Kategori ustKategoriGetir(Long kategoriId) {
		return kategoriDao.ustKategoriGetir(kategoriId);
	}

	@Override
	public boolean kategoriEkle(Kategori kategori) {
		return kategoriDao.kategoriEkle(kategori);
	}

	@Override
	public boolean kategoriSil(Kategori kategori) {
		return kategoriDao.kategoriSil(kategori);
	}

	@Override
	public Kategori kategoriGetir(Long kategoriId) {
		return kategoriDao.kategoriGetir(kategoriId);
	}

	@Override
	public List<Kategori> tumKategorileriGetir() {
		return kategoriDao.tumKategorileriGetir();
	}

	@Override
	public List<Kategori> altKategorileriGetir(Long ustKategoriId) {
		return kategoriDao.altKategorileriGetir(ustKategoriId);
	}

	@Override
	public List<Kategori> tumUstKategorileriGetir() {
		return kategoriDao.tumUstKategorileriGetir();
	}

}

