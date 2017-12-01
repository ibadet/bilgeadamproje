package com.fazlaysapaylas.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.fazlaysapaylas.domain.Kategori;
import com.fazlaysapaylas.domain.Marka;
import com.fazlaysapaylas.domain.Rol;
import com.fazlaysapaylas.domain.Yetki;
import com.fazlaysapaylas.utils.HibernateUtil;

public class VeriOlustur {
	
	Session session=null;
	private List<Marka> markaListesi;
	private List<Kategori> kategoriListesi;
	
	private void markaListesiOlustur(){		
		markaListesi=new ArrayList<Marka>();
		markaListesi.add(new Marka("Fisher Price"));
		markaListesi.add(new Marka("Chicco"));
		markaListesi.add(new Marka("Pilsan"));
		markaListesi.add(new Marka("Armaðan"));	
	}
	
	private void kategoriListesiOlustur(){
		kategoriListesi=new ArrayList<Kategori>();
		Kategori ustKategori1=new Kategori("Oyuncak","OYUNCAK",null); 
		kategoriListesi.add(ustKategori1);
		kategoriListesi.add(new Kategori("Eðitici Oyuncak","EGITICIOYUNCAK",ustKategori1));	
		kategoriListesi.add(new Kategori("Peluþ Oyuncak","PELUSOYUNCAK",ustKategori1));	
		kategoriListesi.add(new Kategori("Puzzle","PUZZLE",ustKategori1));	
		
		
		Kategori ustKategori2=new Kategori("Giyim","GIYIM",null);
		kategoriListesi.add(ustKategori2);
		kategoriListesi.add(new Kategori("Etek-Elbise","ETEKELBISE",ustKategori2));	
		kategoriListesi.add(new Kategori("Mont-Yaðmurluk-Ceket","MONTCEKET",ustKategori2));	
		kategoriListesi.add(new Kategori("Pantolon-Þort","PANTOLON",ustKategori2));	
		
		Kategori ustKategori3=new Kategori("Kitap","KITAP",null);
		kategoriListesi.add(ustKategori3);	
		kategoriListesi.add(new Kategori("Eðitici Kitap", "EGITICI",ustKategori3));	
		kategoriListesi.add(new Kategori("Ebeveynler için Kitap", "EBEVEYN",ustKategori3));	
		kategoriListesi.add(new Kategori("Hikaye-Masal Kitabý", "HIKAYE",ustKategori3));
	}

	private void sessionBaslangic() {
		session=HibernateUtil.getSession();
		session.beginTransaction();
	}
	
	private void sessionBitis(){
		session.getTransaction().commit();
		session.close();		
	}
	
	public void tablolariOlustur(){		
		sessionBaslangic();
		
		markaListesiOlustur();		
		for (Marka marka : markaListesi) {
			session.save(marka);	
		}
		
		kategoriListesiOlustur();
		for (Kategori kategori : kategoriListesi) {
			session.save(kategori);
		}
		
		
		Rol adminRol=new Rol("ADMIN","ADMIN");		
		Rol kullaniciRol=new Rol("KULLANICI","KULLANICI");		 

		Yetki eklemeYetkisi=new Yetki("Yeni Kayýt Ekleme","EKLE");
		Yetki duzenlemeYetkisi=new Yetki("Düzenleme","DUZENLE");
		Yetki silmeYetkisi=new Yetki("Silme","SIL");
	 
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
		
		sessionBitis();
	}
	

}
