import java.util.ArrayList;

public class Main {
      public static void main(String[] args) {
    	  
    	  /*3. Bir hastanede enfeksiyon bölümünde 4 adet temizlik personeli, 20 adet hemþire ve 10 adet doktor çalýþmaktýr.
    	   * Tüm personeli Personel sýnýfýndan türeterek (miras alaraka) her tür peronel için ayrý bir sýnýf yazýnýz.  
 
             a) Bu personellerin adýný ve soyadýný ekrana yazan programý yazýnýz.
             b) Bu personellerin adýný, soyadýný ve kadrosunu (temizlik, hemþire veya doktor) bir önceki fonksiyonu
             override ederek (miras üzerine yazarak) uygulayýnýz. 
             c) Bu personellerin adýný, soyadýný ve kadrosunu override iþlemi yapmadan Personel sýnýfý içerinde yazan programý yazýnýz.
             d) Bu personelleri ad ve soyada göre sýralayan programý yazýnýz. Bu programda sýralama yapmak için aþaðýdaki static fonksiyonu yazýnýz. 
 
             public static void sýrala(){ ArrayList<Personel> personeller = new ArrayList();
             //...Personel ekle...// Collections.sort(personeller);  } 
    	   */
    	  
   	      System.out.print("öykü parlak-18360859019");

    	  ArrayList<Personel> liste=new ArrayList<Personel>();
    	  Doktor dr1=new Doktor("mustafa","yýldýz","doktor");
    	  Doktor dr2=new Doktor("ayþe","keskin","doktor");
    	  Doktor dr3=new Doktor("ali","gördeal","doktor");
    	  Doktor dr4=new Doktor("feyza","küskün","doktor");
    	  Doktor dr5=new Doktor("melisa","sahin","doktor");
    	  Doktor dr6=new Doktor("mehmet","emin","doktor");           
    	  Doktor dr7=new Doktor("fatma","celep","doktor");
    	  Doktor dr8=new Doktor("gülseren","temiz","doktor");
    	  Doktor dr9=new Doktor("þefik","altun","doktor");
    	  Doktor dr10=new Doktor("selim","kýrgýz","doktor");
          Hemsire hemsire1 = new Hemsire("ali","aykut","hemsire");
    	  Hemsire hemsire2 = new Hemsire("fadik","kelkit","hemsire");
    	  Hemsire hemsire3 = new Hemsire("hüsniye","yenitur","hemsire");
    	  Hemsire hemsire4 = new Hemsire("kibar","karaçay","hemsire");
    	  Hemsire hemsire5 = new Hemsire("feyyaz","çelik","hemsire");
    	  Hemsire hemsire6 = new Hemsire("melis","çetin","hemsire");
    	  Hemsire hemsire7 = new Hemsire("cengiz","karakuþ","hemsire");
    	  Hemsire hemsire8 = new Hemsire("aslý","sýký","hemsire");
    	  Hemsire hemsire9 = new Hemsire("nuriye","yýldýz","hemsire");
    	  Hemsire hemsire10= new Hemsire("kerem","yýldýrým","hemsire");
    	  Hemsire hemsire11= new Hemsire("fidan","sarýgül","hemsire");
    	  Hemsire hemsire12= new Hemsire("nurgül","kýzýltaþ","hemsire");
    	  Hemsire hemsire13= new Hemsire("arzu","yazý","hemsire");
    	  Hemsire hemsire14= new Hemsire("beren","sarý","hemsire");
    	  Hemsire hemsire15= new Hemsire("bahar","has","hemsire");
    	  Hemsire hemsire16= new Hemsire("berfin","karayaprak","hemsire");
    	  Hemsire hemsire17= new Hemsire("belgin","eroðlu","hemsire");
    	  Hemsire hemsire18= new Hemsire("okan","türk","hemsire");
    	  Hemsire hemsire19= new Hemsire("durmuþ","akdemir","hemsire");
    	  Hemsire hemsire20= new Hemsire("gül","parlak","hemsire");
    	  Temizlik_personeli temizlik1 = new Temizlik_personeli("ceren","kaya","temizlik personeli");
    	  Temizlik_personeli temizlik2 = new Temizlik_personeli("cemre","durlanýk","temizlik personeli");
    	  Temizlik_personeli temizlik3 = new Temizlik_personeli("deniz","öztop","temizlik personeli");
    	  Temizlik_personeli temizlik4 = new Temizlik_personeli("deniz","ünal","temizlik personeli");
    	  
    	  
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
    	  System.out.println("Personeller listeye eklenmiþtir.");
    	  
    	  
    	 
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
      }
}
