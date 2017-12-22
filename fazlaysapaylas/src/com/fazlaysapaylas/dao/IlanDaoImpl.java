package com.fazlaysapaylas.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.fazlaysapaylas.domain.Ilan;
import com.fazlaysapaylas.domain.Kisi;
import com.fazlaysapaylas.enums.YayinDurumu;
import com.fazlaysapaylas.utils.HibernateUtil;

public class IlanDaoImpl implements IlanDao {
	
	private Session session;

	@Override
	public boolean ilanEkle(Ilan ilan) {
		session=HibernateUtil.getSession();
		session.beginTransaction();
		session.save(ilan);
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public boolean ilanSil(Ilan ilan) {
		session=HibernateUtil.getSession();
		session.beginTransaction();
		session.delete(ilan);
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public boolean ilanGuncelle(Ilan ilan) {
		session=HibernateUtil.getSession();
		session.beginTransaction();
		session.saveOrUpdate(ilan);
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public List<Ilan> yayinDurumunaGoreGetir(YayinDurumu yayinDurumu) {		
		List<Ilan> ilanlar=new ArrayList<Ilan>();
		session=HibernateUtil.getSession();
		session.beginTransaction();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Ilan> selectQuery = builder.createQuery(Ilan.class);	
		Root<Ilan> root=selectQuery.from(Ilan.class);	
		selectQuery.select(root).where(builder.equal(root.get("yayinDurumu"),yayinDurumu));	
		Query<Ilan> query=session.createQuery(selectQuery);	
		ilanlar= query.getResultList();
		session.getTransaction().commit();
		session.close();
		
		return ilanlar;
	}

	@Override
	public List<Ilan> ilaniVereneGoreGetir(Kisi ilaniVeren) {
		List<Ilan> ilanlar=new ArrayList<Ilan>();
		session=HibernateUtil.getSession();
		session.beginTransaction();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Ilan> selectQuery = builder.createQuery(Ilan.class);	
		Root<Ilan> root=selectQuery.from(Ilan.class);	
		selectQuery.select(root).where(builder.equal(root.get("ilaniVeren"),ilaniVeren));	
		Query<Ilan> query=session.createQuery(selectQuery);	
		ilanlar= query.getResultList();
		session.getTransaction().commit();
		session.close();
		
		return ilanlar;
	}

}
