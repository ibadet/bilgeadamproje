package com.fazlaysapaylas.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.fazlaysapaylas.domain.Kullanici;
import com.fazlaysapaylas.utils.HibernateUtil;

@Repository
public class KullaniciDaoImpl implements KullaniciDao {

	@Override
	public Kullanici kullaniciAdinaGoreGetir(String kullaniciAdi) {
		Session session=HibernateUtil.getSession();
		return null;
	}

}
