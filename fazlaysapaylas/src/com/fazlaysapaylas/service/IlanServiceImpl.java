package com.fazlaysapaylas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fazlaysapaylas.dao.IlanDao;
import com.fazlaysapaylas.domain.Ilan;
import com.fazlaysapaylas.domain.Kisi;
import com.fazlaysapaylas.enums.YayinDurumu;

public class IlanServiceImpl implements IlanService {

	@Autowired
	private IlanDao ilanDao;
	
	@Override
	public boolean ilanEkle(Ilan ilan) {
		return ilanDao.ilanEkle(ilan);
	}

	@Override
	public boolean ilanSil(Ilan ilan) {
		return ilanDao.ilanSil(ilan);
	}

	@Override
	public boolean ilanGuncelle(Ilan ilan) {
		return ilanDao.ilanGuncelle(ilan);
	}

	@Override
	public List<Ilan> yayinDurumunaGoreGetir(YayinDurumu yayinDurumu) {
		return ilanDao.yayinDurumunaGoreGetir(yayinDurumu);
	}

	@Override
	public List<Ilan> ilaniVereneGoreGetir(Kisi ilaniVeren) {
		return ilanDao.ilaniVereneGoreGetir(ilaniVeren);
	}

}
