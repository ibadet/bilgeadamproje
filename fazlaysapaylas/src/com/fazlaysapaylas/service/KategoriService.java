package com.fazlaysapaylas.service;

import java.util.List;

import com.fazlaysapaylas.domain.Kategori;

public interface KategoriService {
	
	public List<Kategori> altKategorileriGetir(Kategori ustKategori);
	
	public Kategori ustKategoriGetir(Long kategoriId);

	public boolean kategoriEkle(Kategori kategori);
	
	public boolean kategoriSil(Kategori kategori);
	
	public Kategori kategoriGetir(Long kategoriId);
	
	public List<Kategori> tumKategorileriGetir();
}
