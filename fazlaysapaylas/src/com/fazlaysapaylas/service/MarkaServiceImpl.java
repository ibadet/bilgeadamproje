package com.fazlaysapaylas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fazlaysapaylas.dao.MarkaDao;
import com.fazlaysapaylas.domain.Marka;

@Service
public class MarkaServiceImpl implements MarkaService {

	@Autowired
	private MarkaDao markaDao;
	
	@Override
	public List<Marka> markalariGetir() {
		return markaDao.markalariGetir();
	}

}
