import java.util.ArrayList;

public class Personel {
	   
	String Ad;
	String Soyad;
	String Kadro;
	public Personel( String Ad , String Soyad , String Kadro) {
		this.Ad = Ad;
		this.Kadro= Kadro;
		this.Soyad = Soyad;
	}

	public void AdSoyadYazd�r(ArrayList<Personel> liste) {
		 
		
		System.out.print("Personelin ad� ve soyad�:" + Ad +" "+ Soyad );
		
		
	 }
	 
	  
	  
    public void AdSoyadKadroYazd�r(ArrayList<Personel> liste) {
		 
		
		System.out.print("Personelin ad� soyad� ve kadrosu:" + Ad + " " + Soyad + " " + Kadro);
		
		
	 }
	  
	  
	public void S�ral�Yazd�r(ArrayList<Personel> liste) {
		
		
        
		
		
		}

	public String getAd() {
		return Ad;
	}

	public void setAd(String ad) {
		Ad = ad;
	}

	public String getSoyad() {
		return Soyad;
	}

	public void setSoyad(String soyad) {
		Soyad = soyad;
	}

	public String getKadro() {
		return Kadro;
	}

	public void setKadro(String kadro) {
		Kadro = kadro;
	}
	
	

	
	  
  
	  

}