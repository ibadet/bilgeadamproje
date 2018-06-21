package com.fazlaysapaylas.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.fazlaysapaylas.domain.Marka;
import com.fazlaysapaylas.utils.HibernateUtil;

@Repository
public class MarkaDaoImpl implements MarkaDao {

	private Session session;
	
	@Override
	public List<Marka> markalariGetir() {
		List<Marka> tumMarkalar=new ArrayList<Marka>();
		session=HibernateUtil.getSession();
		session.beginTransaction();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Marka> selectQuery = builder.createQuery(Marka.class);
		Root<Marka> root = selectQuery.from(Marka.class);
		selectQuery.select(root);
		Query<Marka> query=session.createQuery(selectQuery);	
		tumMarkalar= query.getResultList();
		session.getTransaction().commit();
		session.close();
		
		return tumMarkalar;
	}

}
