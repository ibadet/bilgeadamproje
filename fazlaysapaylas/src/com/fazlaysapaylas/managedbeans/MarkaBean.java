package com.fazlaysapaylas.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.fazlaysapaylas.domain.Marka;
import com.fazlaysapaylas.service.MarkaService;


@ManagedBean(name="markaBean")
@SessionScoped
public class MarkaBean {
	
	private List<Marka> markalar;
	private Long markaId;
	
	@ManagedProperty(value="#{markaServiceImpl}")
	private MarkaService markaService;

	public List<Marka> getMarkalar() {
		return markalar;
	}

	public void setMarkalar(List<Marka> markalar) {
		this.markalar = markalar;
	}	

	public Long getMarkaId() {
		return markaId;
	}

	public void setMarkaId(Long markaId) {
		this.markaId = markaId;
	}

	public MarkaService getMarkaService() {
		return markaService;
	}

	public void setMarkaService(MarkaService markaService) {
		this.markaService = markaService;
	}
	

	public MarkaBean() {
		
	}
	
	@PostConstruct
	public void init(){
		 markalar=new ArrayList<Marka>();
		 markalar=markaService.markalariGetir();	
	}
	

	public void onload(){
		 markalar=new ArrayList<Marka>();
		 markalar=markaService.markalariGetir();	 
	}
	

}
