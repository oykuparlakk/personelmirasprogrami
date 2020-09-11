import java.util.ArrayList;

public class Temizlik_personeli extends Personel {

	public Temizlik_personeli(String Ad, String Soyad, String Kadro) {
		super(Ad, Soyad, Kadro);
		
	}

	@Override
	public void AdSoyadYazdýr(ArrayList<Personel> liste) {
		// TODO Auto-generated method stub
		super.AdSoyadYazdýr(liste);
		System.out.println("Kadrosu:"+Kadro);

	}
      
	
	
	
	
	
	
}
