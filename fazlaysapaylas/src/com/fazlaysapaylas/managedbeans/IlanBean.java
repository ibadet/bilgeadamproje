package com.fazlaysapaylas.managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.fazlaysapaylas.domain.Ilan;
import com.fazlaysapaylas.service.IlanService;

@ManagedBean
@SessionScoped
public class IlanBean {
	
	private Ilan ilan=new Ilan();	
	@ManagedProperty(value="#{ilanServiceImpl}")
	private IlanService ilanService;
	
	public Ilan getIlan() {
		return ilan;
	}
	public void setIlan(Ilan ilan) {
		this.ilan = ilan;
	}
	public IlanService getIlanService() {
		return ilanService;
	}
	public void setIlanService(IlanService ilanService) {
		this.ilanService = ilanService;
	}

	public IlanBean(){
		
	}
}
