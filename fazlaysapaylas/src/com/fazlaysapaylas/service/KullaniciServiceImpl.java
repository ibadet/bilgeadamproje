package com.fazlaysapaylas.service;

import org.springframework.stereotype.Service;

import com.fazlaysapaylas.dao.KullaniciDao;
import com.fazlaysapaylas.dao.KullaniciDaoImpl;
import com.fazlaysapaylas.domain.Kullanici;
import com.fazlaysapaylas.domain.Rol;

@Service
public class KullaniciServiceImpl implements KullaniciService {
	
	//@Autowired
	private KullaniciDao kullaniciDao=new KullaniciDaoImpl();

	@Override
	public Kullanici kullaniciAdinaGoreGetir(String kullaniciAdi) {
			return kullaniciDao.kullaniciAdinaGoreGetir(kullaniciAdi);
	}

	@Override
	public Kullanici kullaniciGetir(String kullaniciAdi, String sifre) {
			return kullaniciDao.kullaniciGetir(kullaniciAdi, sifre);
	}

	@Override
	public boolean kullaniciEkle(Kullanici kullanici) {
			return kullaniciDao.kullaniciEkle(kullanici);
	}

	@Override
	public boolean kullaniciSil(Kullanici kullanici) {
			return kullaniciDao.kullaniciSil(kullanici);
	}

	@Override
	public Rol kullaniciRoluGetir(Long id) {
			return kullaniciDao.kullaniciRoluGetir(id);
	}

}
