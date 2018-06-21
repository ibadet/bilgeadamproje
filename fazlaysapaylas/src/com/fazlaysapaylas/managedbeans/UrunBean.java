package com.fazlaysapaylas.managedbeans;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.model.UploadedFile;

import com.fazlaysapaylas.domain.Ilan;
import com.fazlaysapaylas.domain.Kategori;
import com.fazlaysapaylas.domain.Marka;
import com.fazlaysapaylas.domain.Urun;
import com.fazlaysapaylas.enums.UrunDurumu;
import com.fazlaysapaylas.service.UrunService;

@ManagedBean(name = "urunBean")
@ViewScoped
public class UrunBean {

	private String tanim;
	private Kategori secilenKategori;
	private Kategori secilenAltKategori;
	private Long secilenAltKategoriId;
	private Marka secilenMarka;
	private Long secilenMarkaId;
	private UrunDurumu kullanimDurumu;
	private String girilenAciklama;
	private Integer urunPuan;
	private byte[] fotograf;
	private Ilan ilan;

	UploadedFile yuklenenDosya;

	@ManagedProperty(value = "#{urunServiceImpl}")
	private UrunService urunService;

	public UploadedFile getYuklenenDosya() {
		return yuklenenDosya;
	}

	public void setYuklenenDosya(UploadedFile yuklenenDosya) {
		this.yuklenenDosya = yuklenenDosya;
	}

	public String getTanim() {
		return tanim;
	}

	public void setTanim(String tanim) {
		this.tanim = tanim;
	}

	public Kategori getSecilenKategori() {
		return secilenKategori;
	}

	public void setSecilenKategori(Kategori secilenKategori) {
		this.secilenKategori = secilenKategori;
	}

	public Kategori getSecilenAltKategori() {
		return secilenAltKategori;
	}

	public void setSecilenAltKategori(Kategori secilenAltKategori) {
		this.secilenAltKategori = secilenAltKategori;
	}

	public Marka getSecilenMarka() {
		return secilenMarka;
	}

	public void setSecilenMarka(Marka secilenMarka) {
		this.secilenMarka = secilenMarka;
	}

	public String getGirilenAciklama() {
		return girilenAciklama;
	}

	public void setGirilenAciklama(String girilenAciklama) {
		this.girilenAciklama = girilenAciklama;
	}

	public Integer getUrunPuan() {
		return urunPuan;
	}

	public void setUrunPuan(Integer urunPuan) {
		this.urunPuan = urunPuan;
	}

	public byte[] getFotograf() {
		return fotograf;
	}

	public void setFotograf(byte[] fotograf) {
		this.fotograf = fotograf;
	}

	public Ilan getIlan() {
		return ilan;
	}

	public void setIlan(Ilan ilan) {
		this.ilan = ilan;
	}

	public UrunDurumu getKullanimDurumu() {
		return kullanimDurumu;
	}

	public void setKullanimDurumu(UrunDurumu kullanimDurumu) {
		this.kullanimDurumu = kullanimDurumu;
	}

	public UrunService getUrunService() {
		return urunService;
	}

	public void setUrunService(UrunService urunService) {
		this.urunService = urunService;
	}

	public Long getSecilenAltKategoriId() {
		return secilenAltKategoriId;
	}

	public void setSecilenAltKategoriId(Long secilenAltKategoriId) {
		this.secilenAltKategoriId = secilenAltKategoriId;
	}

	public Long getSecilenMarkaId() {
		return secilenMarkaId;
	}

	public void setSecilenMarkaId(Long secilenMarkaId) {
		this.secilenMarkaId = secilenMarkaId;
	}

	public UrunBean() {

	}

	public void urunKaydet() {
		Boolean sonuc;
		ilan = new Ilan();
		ilan.setIlanNo(new Long(123));

		secilenAltKategori = new Kategori();
		secilenAltKategori.setId(secilenAltKategoriId);
		secilenMarka = new Marka();
		secilenMarka.setId(secilenMarkaId);

		Urun urun = new Urun(tanim, secilenAltKategori, secilenMarka,
				kullanimDurumu, girilenAciklama, null, fotograf, ilan);
		sonuc = urunService.urunEkle(urun);
		if (sonuc == true) {
			addMessage(FacesMessage.SEVERITY_INFO, "İşlem Başarılı!",
					"Yeni Kayıt Eklendi.");
		}

	}

	public void addMessage(Severity messageType, String summary, String detail) {
		FacesMessage message = new FacesMessage(messageType, summary, detail);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public void dosyayiYukle() throws IOException {

		if (yuklenenDosya != null) {
			FacesMessage message = new FacesMessage("Başarılı",
					yuklenenDosya.getFileName() + " isimli dosya yüklendi.");
			FacesContext.getCurrentInstance().addMessage(null, message);

			fotograf = yuklenenDosya.getContents();

		}
	}

}
