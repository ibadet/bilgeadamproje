package com.fazlaysapaylas.managedbeans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;

import com.fazlaysapaylas.utils.ResourceManager;


@ManagedBean
@RequestScoped
public class DosyaYukleBean {
	
	 public void handleFileUpload(FileUploadEvent event) {
	        FacesMessage message = new FacesMessage(ResourceManager.getStringValue("dosyayukleme.islembasarili"));
	        FacesContext.getCurrentInstance().addMessage(ResourceManager.getStringValue("islem.basarili"), message);
		    }

}
