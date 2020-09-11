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

	public void AdSoyadYazdýr(ArrayList<Personel> liste) {
		 
		
		System.out.print("Personelin adý ve soyadý:" + Ad +" "+ Soyad );
		
		
	 }
	 
	  
	  
    public void AdSoyadKadroYazdýr(ArrayList<Personel> liste) {
		 
		
		System.out.print("Personelin adý soyadý ve kadrosu:" + Ad + " " + Soyad + " " + Kadro);
		
		
	 }
	  
	  
	public void SýralýYazdýr(ArrayList<Personel> liste) {
		
		
        
		
		
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