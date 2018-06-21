package com.fazlaysapaylas.managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.UploadedFile;


@ManagedBean
@RequestScoped
public class DosyaYukleBean {
	
  	UploadedFile yuklenenDosya;
  	
  	
 	public UploadedFile getYuklenenDosya() {
		return yuklenenDosya;
	}


	public void setYuklenenDosya(UploadedFile yuklenenDosya) {
		this.yuklenenDosya = yuklenenDosya;
	}

/*
	public void fileUploadListener(FileUploadEvent event) {
		 
		 // Get uploaded file from the FileUploadEvent
			this.yuklenenDosya = event.getFile();
			// Print out the information of the file
			System.out.println("Uploaded File Name Is :: "+yuklenenDosya.getFileName()+" :: Uploaded File Size :: "+yuklenenDosya.getSize());
	        FacesMessage message = new FacesMessage(ResourceManager.getStringValue("dosyayukleme.islembasarili"));
	        FacesContext.getCurrentInstance().addMessage(ResourceManager.getStringValue("islem.basarili"), message);
		    }*/
	

}
