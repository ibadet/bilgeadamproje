package com.fazlaysapaylas.dao;

import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.fazlaysapaylas.domain.Kullanici;
import com.fazlaysapaylas.domain.Rol;
import com.fazlaysapaylas.utils.HibernateUtil;

@Repository
public class KullaniciDaoImpl implements KullaniciDao {
	
	private Session session;

	@Override
	public Kullanici kullaniciAdinaGoreGetir(String kullaniciAdi) {
		session=HibernateUtil.getSession();
		session.beginTransaction();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Kullanici> selectQuery = builder.createQuery(Kullanici.class);		
		Root<Kullanici> root=selectQuery.from(Kullanici.class);	
		selectQuery.select(root).where(builder.equal(root.get("kullaniciAdi"),kullaniciAdi));		
		Query<Kullanici> query=session.createQuery(selectQuery);	
		Kullanici kullanici= query.getSingleResult();
		session.getTransaction().commit();
		session.close();
		return kullanici;
	}

	@Override
	public Kullanici kullaniciGetir(String kullaniciAdi, String sifre) {
		session=HibernateUtil.getSession();
		session.beginTransaction();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Kullanici> selectQuery = builder.createQuery(Kullanici.class);		
		Root<Kullanici> root=selectQuery.from(Kullanici.class);	
		selectQuery.select(root).where(builder.equal(root.get("kullaniciAdi"),kullaniciAdi),builder.equal(root.get("sifre"),sifre));		
		Query<Kullanici> query=session.createQuery(selectQuery);	
		
		try {
			Kullanici kullanici= query.getSingleResult();				
			return kullanici;			
		} catch (NoResultException e) {
			return null;
		}finally{
			session.getTransaction().commit();
			session.close();	
		}
	}

	@Override
	public boolean kullaniciEkle(Kullanici kullanici) {
		session=HibernateUtil.getSession();
		session.beginTransaction();
		session.save(kullanici);
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public boolean kullaniciSil(Kullanici kullanici) {
		session=HibernateUtil.getSession();
		session.beginTransaction();
		session.delete(kullanici);
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public Rol kullaniciRoluGetir(Long id) {
		session=HibernateUtil.getSession();
		session.beginTransaction();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Kullanici> selectQuery = builder.createQuery(Kullanici.class);		
		Root<Kullanici> root=selectQuery.from(Kullanici.class);	
		selectQuery.select(root).where(builder.equal(root.get("id"),id));		
		Query<Kullanici> query=session.createQuery(selectQuery);	
		Kullanici kullanici= query.getSingleResult();	
		Rol rol=kullanici.getKullaniciRol();
		session.getTransaction().commit();
		session.close();
		return rol;
	}

}
