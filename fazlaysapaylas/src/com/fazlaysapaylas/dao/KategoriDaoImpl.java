package com.fazlaysapaylas.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.fazlaysapaylas.domain.Kategori;
import com.fazlaysapaylas.utils.HibernateUtil;

public class KategoriDaoImpl implements KategoriDao {

	private Session session;

	@Override
	public List<Kategori> altKategorileriGetir(Kategori ustKategori) {
		List<Kategori> altKategoriler=new ArrayList<Kategori>();
		session=HibernateUtil.getSession();
		session.beginTransaction();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Kategori> selectQuery = builder.createQuery(Kategori.class);	
		Root<Kategori> root=selectQuery.from(Kategori.class);	
		selectQuery.select(root).where(builder.equal(root.get("ustKategori"),ustKategori));	
		Query<Kategori> query=session.createQuery(selectQuery);	
		altKategoriler= query.getResultList();
		session.getTransaction().commit();
		session.close();
		
		return altKategoriler;
	}

	@Override
	public Kategori ustKategoriGetir(Long kategoriId) {
		session=HibernateUtil.getSession();
		session.beginTransaction();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Kategori> selectQuery = builder.createQuery(Kategori.class);	
		Root<Kategori> root=selectQuery.from(Kategori.class);	
		selectQuery.select(root).where(builder.equal(root.get("id"),kategoriId));	
		Query<Kategori> query=session.createQuery(selectQuery);	
		Kategori kategori=query.getSingleResult();			
		session.getTransaction().commit();
		session.close();
		
		return kategori.getUstKategori();
	
	}

	@Override
	public boolean kategoriEkle(Kategori kategori) {
		session=HibernateUtil.getSession();
		session.beginTransaction();
		session.save(kategori);
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public boolean kategoriSil(Kategori kategori) {
		session=HibernateUtil.getSession();
		session.beginTransaction();
		session.delete(kategori);
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public Kategori kategoriGetir(Long kategoriId) {
		session=HibernateUtil.getSession();
		session.beginTransaction();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Kategori> selectQuery = builder.createQuery(Kategori.class);	
		Root<Kategori> root=selectQuery.from(Kategori.class);	
		selectQuery.select(root).where(builder.equal(root.get("id"),kategoriId));	
		Query<Kategori> query=session.createQuery(selectQuery);	
		Kategori kategori=query.getSingleResult();			
		session.getTransaction().commit();
		session.close();
		
		return kategori;
	}

}