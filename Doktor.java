import java.util.ArrayList;

public class Doktor extends Personel {

	public Doktor(String Ad, String Soyad, String Kadro) {
		super(Ad, Soyad, Kadro);
		
	}

	@Override
	public void AdSoyadYazd�r(ArrayList<Personel> liste) {
		// TODO Auto-generated method stub
		super.AdSoyadYazd�r(liste);
		System.out.println("Kadrosu:"+Kadro);
	}
      
	
	
	
	
	
	
	
	
	
	
	
	
	 
	
}
