package com.fazlaysapaylas.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;

import com.fazlaysapaylas.domain.Il;
import com.fazlaysapaylas.domain.Ilce;
import com.fazlaysapaylas.domain.Kategori;
import com.fazlaysapaylas.domain.Kullanici;
import com.fazlaysapaylas.domain.Marka;
import com.fazlaysapaylas.domain.Rol;
import com.fazlaysapaylas.domain.Yetki;
import com.fazlaysapaylas.utils.HibernateUtil;

public class VeriOlustur {

	Session session = null;
	private List<Marka> markaListesi;
	private List<Kategori> kategoriListesi;
	private List<Ilce> ilceListesi;
	
	
	private void ilceListesiOlustur(){
		//TODO:Tüm ilçelerin yüklenmesi gerekiyor.
		ilceListesi=new ArrayList<Ilce>();
		Il ilAdana=new Il("01","Adana");
		ilceListesi.add(new Ilce(ilAdana,"Ceyhan"));
		
		Il ilAnkara=new Il("06","Ankara");
		ilceListesi.add(new Ilce(ilAnkara,"Çankaya"));
		
		Il ilIstanbul=new Il("34","İstanbul");
		ilceListesi.add(new Ilce(ilIstanbul,"Beşiktaş"));
		
		Il ilIzmir=new Il("35","İzmir");
		ilceListesi.add(new Ilce(ilIzmir,"Aliağa"));
		ilceListesi.add(new Ilce(ilIzmir,"Bergama"));
		
	}


	private void markaListesiOlustur() {
		markaListesi = new ArrayList<Marka>();
		markaListesi.add(new Marka("Fisher Price"));
		markaListesi.add(new Marka("Chicco"));
		markaListesi.add(new Marka("Pilsan"));
		markaListesi.add(new Marka("ArmağanOyuncak"));
		markaListesi.add(new Marka("Diğer"));
	}

	private void kategoriListesiOlustur() {
		kategoriListesi = new ArrayList<Kategori>();
		Kategori ustKategori1 = new Kategori("Oyuncak", "OYUNCAK", null);
		kategoriListesi.add(ustKategori1);
		kategoriListesi.add(new Kategori("Eğitici Oyuncak", "EGITICIOYUNCAK",
				ustKategori1));
		kategoriListesi.add(new Kategori("Peluş Oyuncak", "PELUSOYUNCAK",
				ustKategori1));
		kategoriListesi.add(new Kategori("Puzzle", "PUZZLE", ustKategori1));
		kategoriListesi.add(new Kategori("Diğer", "DİGER", ustKategori1));

		Kategori ustKategori2 = new Kategori("Giyim", "GIYIM", null);
		kategoriListesi.add(ustKategori2);
		kategoriListesi.add(new Kategori("Etek-Elbise", "ETEKELBISE",
				ustKategori2));
		kategoriListesi.add(new Kategori("Mont-Yağmurluk-Ceket", "MONTCEKET",
				ustKategori2));
		kategoriListesi.add(new Kategori("Kostüm", "KOSTUM",
				ustKategori2));
		kategoriListesi.add(new Kategori("Diğer", "DIGER",
				ustKategori2));

		Kategori ustKategori3 = new Kategori("Kitap", "KITAP", null);
		kategoriListesi.add(ustKategori3);
		kategoriListesi.add(new Kategori("Eğitici Kitap", "EGITICI",
				ustKategori3));
		kategoriListesi.add(new Kategori("Ebeveynler için Kitap", "EBEVEYN",
				ustKategori3));
		kategoriListesi.add(new Kategori("Hikaye-Masal Kitabı", "HIKAYE",
				ustKategori3));
		kategoriListesi.add(new Kategori("Diğer", "DIGER",
				ustKategori3));
	}

	private void sessionBaslangic() {
		session = HibernateUtil.getSession();
		session.beginTransaction();
	}

	private void sessionBitis() {
		session.getTransaction().commit();
		session.close();
	}

	public void tablolariOlustur() {
		Date dogumTarihi = null;
		sessionBaslangic();
		
		ilceListesiOlustur();
		for (Ilce ilce : ilceListesi) {
			session.save(ilce);
		}

		markaListesiOlustur();
		for (Marka marka : markaListesi) {
			session.save(marka);
		}

		kategoriListesiOlustur();
		for (Kategori kategori : kategoriListesi) {
			session.save(kategori);
		}

		Rol adminRol = new Rol("ADMIN", "ADMIN");
		Rol kullaniciRol = new Rol("KULLANICI", "KULLANICI");

		Yetki eklemeYetkisi = new Yetki("Yeni Kayıt Ekleme", "EKLE");
		Yetki duzenlemeYetkisi = new Yetki("Düzenleme", "DUZENLE");
		Yetki silmeYetkisi = new Yetki("Silme", "SIL");

		adminRol.yetkiEkle(eklemeYetkisi);
		adminRol.yetkiEkle(duzenlemeYetkisi);
		adminRol.yetkiEkle(silmeYetkisi);

		kullaniciRol.yetkiEkle(eklemeYetkisi);
		kullaniciRol.yetkiEkle(duzenlemeYetkisi);

		eklemeYetkisi.rolEkle(adminRol);
		eklemeYetkisi.rolEkle(kullaniciRol);
		duzenlemeYetkisi.rolEkle(adminRol);
		duzenlemeYetkisi.rolEkle(kullaniciRol);
		silmeYetkisi.rolEkle(adminRol);

		session.save(adminRol);
		session.save(kullaniciRol);

		//Kullanici ekle.
		
		Kullanici kullanici = new Kullanici("admin", "admin123", adminRol);
		kullanici.setAd("fazla");
		kullanici.setSoyad("paylas");
		kullanici.setCepTelefonu("05051112233");
		kullanici.setEpostaAdresi("fazlasinipaylas@gmail.com");
		SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");		
		try {
			dogumTarihi = formatter.parse("01.01.1979");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		kullanici.setDogumTarihi(dogumTarihi);
		kullanici.setAdres("bla bla..");

		session.save(kullanici);

		// }

		sessionBitis();
	}

}
