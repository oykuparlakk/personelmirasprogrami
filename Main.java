import java.util.ArrayList;

public class Main {
      public static void main(String[] args) {
    	  
    	  /*3. Bir hastanede enfeksiyon b�l�m�nde 4 adet temizlik personeli, 20 adet hem�ire ve 10 adet doktor �al��makt�r.
    	   * T�m personeli Personel s�n�f�ndan t�reterek (miras alaraka) her t�r peronel i�in ayr� bir s�n�f yaz�n�z.  
 
             a) Bu personellerin ad�n� ve soyad�n� ekrana yazan program� yaz�n�z.
             b) Bu personellerin ad�n�, soyad�n� ve kadrosunu (temizlik, hem�ire veya doktor) bir �nceki fonksiyonu
             override ederek (miras �zerine yazarak) uygulay�n�z. 
             c) Bu personellerin ad�n�, soyad�n� ve kadrosunu override i�lemi yapmadan Personel s�n�f� i�erinde yazan program� yaz�n�z.
             d) Bu personelleri ad ve soyada g�re s�ralayan program� yaz�n�z. Bu programda s�ralama yapmak i�in a�a��daki static fonksiyonu yaz�n�z. 
 
             public static void s�rala(){ ArrayList<Personel> personeller = new ArrayList();
             //...Personel ekle...// Collections.sort(personeller);  } 
    	   */
    	  
   	      System.out.print("�yk� parlak-18360859019");

    	  ArrayList<Personel> liste=new ArrayList<Personel>();
    	  Doktor dr1=new Doktor("mustafa","y�ld�z","doktor");
    	  Doktor dr2=new Doktor("ay�e","keskin","doktor");
    	  Doktor dr3=new Doktor("ali","g�rdeal","doktor");
    	  Doktor dr4=new Doktor("feyza","k�sk�n","doktor");
    	  Doktor dr5=new Doktor("melisa","sahin","doktor");
    	  Doktor dr6=new Doktor("mehmet","emin","doktor");           
    	  Doktor dr7=new Doktor("fatma","celep","doktor");
    	  Doktor dr8=new Doktor("g�lseren","temiz","doktor");
    	  Doktor dr9=new Doktor("�efik","altun","doktor");
    	  Doktor dr10=new Doktor("selim","k�rg�z","doktor");
          Hemsire hemsire1 = new Hemsire("ali","aykut","hemsire");
    	  Hemsire hemsire2 = new Hemsire("fadik","kelkit","hemsire");
    	  Hemsire hemsire3 = new Hemsire("h�sniye","yenitur","hemsire");
    	  Hemsire hemsire4 = new Hemsire("kibar","kara�ay","hemsire");
    	  Hemsire hemsire5 = new Hemsire("feyyaz","�elik","hemsire");
    	  Hemsire hemsire6 = new Hemsire("melis","�etin","hemsire");
    	  Hemsire hemsire7 = new Hemsire("cengiz","karaku�","hemsire");
    	  Hemsire hemsire8 = new Hemsire("asl�","s�k�","hemsire");
    	  Hemsire hemsire9 = new Hemsire("nuriye","y�ld�z","hemsire");
    	  Hemsire hemsire10= new Hemsire("kerem","y�ld�r�m","hemsire");
    	  Hemsire hemsire11= new Hemsire("fidan","sar�g�l","hemsire");
    	  Hemsire hemsire12= new Hemsire("nurg�l","k�z�lta�","hemsire");
    	  Hemsire hemsire13= new Hemsire("arzu","yaz�","hemsire");
    	  Hemsire hemsire14= new Hemsire("beren","sar�","hemsire");
    	  Hemsire hemsire15= new Hemsire("bahar","has","hemsire");
    	  Hemsire hemsire16= new Hemsire("berfin","karayaprak","hemsire");
    	  Hemsire hemsire17= new Hemsire("belgin","ero�lu","hemsire");
    	  Hemsire hemsire18= new Hemsire("okan","t�rk","hemsire");
    	  Hemsire hemsire19= new Hemsire("durmu�","akdemir","hemsire");
    	  Hemsire hemsire20= new Hemsire("g�l","parlak","hemsire");
    	  Temizlik_personeli temizlik1 = new Temizlik_personeli("ceren","kaya","temizlik personeli");
    	  Temizlik_personeli temizlik2 = new Temizlik_personeli("cemre","durlan�k","temizlik personeli");
    	  Temizlik_personeli temizlik3 = new Temizlik_personeli("deniz","�ztop","temizlik personeli");
    	  Temizlik_personeli temizlik4 = new Temizlik_personeli("deniz","�nal","temizlik personeli");
    	  
    	  
		  liste.add(dr1);
		  liste.add(dr2);
		  liste.add(dr3);
		  liste.add(dr4);
		  liste.add(dr5);
		  liste.add(dr6);
		  liste.add(dr7);
		  liste.add(dr8);
		  liste.add(dr9);
		  liste.add(dr10);
		  liste.add(hemsire1);
		  liste.add(hemsire2);
		  liste.add(hemsire3);
		  liste.add(hemsire4);
		  liste.add(hemsire5);
		  liste.add(hemsire6);
		  liste.add(hemsire7);
		  liste.add(hemsire8);
		  liste.add(hemsire9);
		  liste.add(hemsire10);
		  liste.add(hemsire11);
		  liste.add(hemsire12);
		  liste.add(hemsire13);
		  liste.add(hemsire14);
		  liste.add(hemsire15);
		  liste.add(hemsire16);
		  liste.add(hemsire17);
		  liste.add(hemsire18);
		  liste.add(hemsire19);
		  liste.add(hemsire20);
		  liste.add(temizlik1);
		  liste.add(temizlik2);
		  liste.add(temizlik3);
		  liste.add(temizlik4);
    	  System.out.println("Personeller listeye eklenmi�tir.");
    	  
    	  
    	 
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
      }
}
