package com.fazlaysapaylas.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.fazlaysapaylas.domain.Kategori;
import com.fazlaysapaylas.domain.Marka;
import com.fazlaysapaylas.domain.Urun;
import com.fazlaysapaylas.enums.UrunDurumu;
import com.fazlaysapaylas.utils.HibernateUtil;

@Repository
public class UrunDaoImpl implements UrunDao {
	
	private Session session;

	@Override
	public List<Urun> kategoriyeGoreUrunGetir(Kategori kategori) {
		List<Urun> urunListesi=new ArrayList<Urun>();
		session=HibernateUtil.getSession();
		session.beginTransaction();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Urun> selectQuery = builder.createQuery(Urun.class);	
		Root<Urun> root=selectQuery.from(Urun.class);	
		selectQuery.select(root).where(builder.equal(root.get("kategori"),kategori));	
		Query<Urun> query=session.createQuery(selectQuery);	
		urunListesi= query.getResultList();
		session.getTransaction().commit();
		session.close();
		
		return urunListesi;
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
		session=HibernateUtil.getSession();
		session.beginTransaction();
		session.save(urun.getIlan());
		session.save(urun);
		session.getTransaction().commit();
		session.close();
		return true;
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
