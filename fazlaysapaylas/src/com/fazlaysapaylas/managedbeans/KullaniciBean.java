package com.fazlaysapaylas.managedbeans;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.fazlaysapaylas.domain.Kullanici;
import com.fazlaysapaylas.service.KullaniciService;

@ManagedBean
@SessionScoped
public class KullaniciBean {
	
	private Kullanici kullanici=new Kullanici();
	
	@ManagedProperty(value="#{kullaniciServiceImpl}")
	private KullaniciService kullaniciService;

	public Kullanici getKullanici() {
		return kullanici;
	}

	public void setKullanici(Kullanici kullanici) {
		this.kullanici = kullanici;
	}

	public KullaniciService getKullaniciService() {
		return kullaniciService;
	}

	public void setKullaniciService(KullaniciService kullaniciService) {
		this.kullaniciService = kullaniciService;
	}
	
	
	public KullaniciBean(){
		
	}
	
	@PostConstruct
	public void init(){
		
	}
	
	public String girisKontrol(){
				
		kullanici=kullaniciService.kullaniciGetir(kullanici.getKullaniciAdi(), kullanici.getSifre());
		if(kullanici==null){
			kullanici=new Kullanici();
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Kullanıcı adı ve/veya şifre hatalı!","Giriş Hatası!"));
			return null;
		}else{
			return "ilanver?faces-redirect=true";
		}
	}
}
