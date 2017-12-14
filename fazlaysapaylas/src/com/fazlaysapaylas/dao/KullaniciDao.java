package com.fazlaysapaylas.dao;

import com.fazlaysapaylas.domain.Kullanici;
import com.fazlaysapaylas.domain.Rol;

public interface KullaniciDao {
	
	public Kullanici kullaniciAdinaGoreGetir(String kullaniciAdi);
	
	public Kullanici kullaniciGetir(String kullaniciAdi,String sifre);
	
	public boolean kullaniciEkle(Kullanici kullanici);
	
	public boolean kullaniciSil(Kullanici kullanici);
	
	public Rol kullaniciRoluGetir(Long id);

}
