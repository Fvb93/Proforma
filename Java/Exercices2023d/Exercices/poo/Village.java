package poo;

public class Village {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Schtroumpf num1;
		num1=new Schtroumpf(); // création d'un schtroumpf en mémoire
		Schtroumpf num2= new Schtroumpf("Schtroumpf timide");
		Schtroumpf t[]=new Schtroumpf[5];
		GrandSchtroumpf leChef= new GrandSchtroumpf();
		Schtroumpfette elle= new Schtroumpfette();
		Costaud fort=new Costaud();
		
		
		System.out.println("Combien de schtroumpf : "+Schtroumpf.getNb());
		num1.setNom("Schtroumpf bricoleur");
		num1.parle();
		num2.parle();
		num1.dessine();
		num2.dessine();
		for (int i=0;i<t.length;i++) {
			t[i]=new Schtroumpf();
		}
		for (int i=0;i<t.length;i++) {
			t[i].parle();
		}
		leChef.dessine();
		elle.dessine();
		fort.setNom("Schtroumpf Costaud");
		fort.dessine();
		fort.force();
	}
}
