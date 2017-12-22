package com.fazlaysapaylas.test;





public class Test {

	public static void main(String[] args) {		
		VeriOlustur veriOlustur=new VeriOlustur();	
		veriOlustur.tablolariOlustur();

		
		/*
		String kullaniciAdi="ibad";
		KullaniciService kullaniciService=new KullaniciServiceImpl();	
		Kullanici kullanici=kullaniciService.kullaniciAdinaGoreGetir(kullaniciAdi);
	    System.out.println(kullanici.toString());
	    
    
    	List<Kategori> altKategoriler=new ArrayList<Kategori>();
    
	    KategoriService kategoriService=new KategoriServiceImpl();
	    Kategori kategori=kategoriService.kategoriGetir(1L);
	    altKategoriler=kategoriService.altKategorileriGetir(kategori);
		for (Kategori kategoriItem : altKategoriler) {
			System.out.println(kategoriItem.getKategoriAdi());
		}
		
		KategoriService kategoriService=new KategoriServiceImpl();
		Boolean sonuc=kategoriService.kategoriEkle(new Kategori("Elektronik", "ELEKTRONIK", null));
		if (sonuc==true)
			System.out.println("baþarýyla eklendi");
		*/
		
//	
//		UrunService urunService=new UrunServiceImpl();
//		KategoriService kategoriService=new KategoriServiceImpl();
//		Kategori kategori=kategoriService.kategoriGetir(1L);
//		List<Urun> urunListesi=new ArrayList<Urun>();
//	    urunListesi=urunService.kategoriyeGoreUrunGetir(kategori);
		
	}
}
