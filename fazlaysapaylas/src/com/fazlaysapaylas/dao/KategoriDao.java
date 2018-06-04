package com.fazlaysapaylas.dao;

import java.util.List;

import com.fazlaysapaylas.domain.Kategori;

public interface KategoriDao {
	
	public List<Kategori> altKategorileriGetir(Kategori ustKategori);
	
	public List<Kategori> altKategorileriGetir(Long ustKategoriId);
	
	public Kategori ustKategoriGetir(Long kategoriId);

	public Kategori kategoriGetir(Long kategoriId);
	
	public boolean kategoriEkle(Kategori kategori);
	
	public boolean kategoriSil(Kategori kategori);
	
	public List<Kategori> tumKategorileriGetir();
	
	public List<Kategori> tumUstKategorileriGetir();
}
