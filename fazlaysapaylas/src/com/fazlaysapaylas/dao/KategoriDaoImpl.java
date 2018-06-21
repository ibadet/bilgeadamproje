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
import com.fazlaysapaylas.utils.HibernateUtil;

@Repository
public class KategoriDaoImpl implements KategoriDao {

	private Session session;

	@Override
	public List<Kategori> altKategorileriGetir(Kategori ustKategori) {
		List<Kategori> altKategoriler=new ArrayList<Kategori>();
		//Map<String,Kategori> altKategoriler=new HashMap<String, Kategori>();
		session=HibernateUtil.getSession();
		session.beginTransaction();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Kategori> selectQuery = builder.createQuery(Kategori.class);	
		Root<Kategori> root=selectQuery.from(Kategori.class);	
		selectQuery.select(root).where(builder.equal(root.get("ustKategori"),ustKategori));	
		Query<Kategori> query=session.createQuery(selectQuery);	
		altKategoriler=  query.getResultList();
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

	@Override
	public List<Kategori> tumKategorileriGetir() {
		List<Kategori> tumKategoriler=new ArrayList<Kategori>();
		session=HibernateUtil.getSession();
		session.beginTransaction();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Kategori> selectQuery = builder.createQuery(Kategori.class);
		Root<Kategori> root = selectQuery.from(Kategori.class);
		selectQuery.select(root);
		Query<Kategori> query=session.createQuery(selectQuery);	
		tumKategoriler= query.getResultList();
		session.getTransaction().commit();
		session.close();
		
		return tumKategoriler;
	
	}

	@Override
	public List<Kategori> altKategorileriGetir(Long ustKategoriId) {
	   List<Kategori> altKategoriler=new ArrayList<Kategori>();
		//Map<String,Kategori> altKategoriler=new HashMap<String, Kategori>();
		session=HibernateUtil.getSession();
		session.beginTransaction();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Kategori> selectQuery = builder.createQuery(Kategori.class);	
		Root<Kategori> root=selectQuery.from(Kategori.class);	
		selectQuery.select(root).where(builder.equal(root.get("ustKategori").get("id"),ustKategoriId));	
		Query<Kategori> query=session.createQuery(selectQuery);	
		altKategoriler= query.getResultList();
		session.getTransaction().commit();
		session.close();
		
		return altKategoriler;
	}

	@Override
	public List<Kategori> tumUstKategorileriGetir() {
		List<Kategori> tumUstKategoriler=new ArrayList<Kategori>();
		session=HibernateUtil.getSession();
		session.beginTransaction();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Kategori> selectQuery = builder.createQuery(Kategori.class);
		Root<Kategori> root = selectQuery.from(Kategori.class);
		//selectQuery.select(root).where(builder.equal(root.get("ustKategori"),null));
		selectQuery.select(root).where(builder.isNull(root.get("ustKategori")));
		Query<Kategori> query=session.createQuery(selectQuery);	
		tumUstKategoriler= query.getResultList();
		session.getTransaction().commit();
		session.close();
		
		return tumUstKategoriler;
	}

}
