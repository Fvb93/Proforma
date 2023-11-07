package poo;

import java.util.Random;

public class FêteAuVillage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Schtroumpf leSctroumpfDuMois;
		Random r = new Random ();
		Schtroumpf[] t= new Schtroumpf[10];
		t[0]= new GrandSchtroumpf();
		t[1]= new Schtroumpfette();
		t[2]= new Costaud();
	 
		for (int i=3;i<t.length;i++) {
			t[i]= new Schtroumpf();
		}
		for (int i=0;i<t.length;i++) {
			t[i].dessine(); // on utilise la virtualité des fonctions
		}
		leSctroumpfDuMois =t[r.nextInt(t.length)];
		leSctroumpfDuMois.dessine();
		if (leSctroumpfDuMois instanceof GrandSchtroumpf) {
			System.out.println("C'est le chef !!");
		}
		if (leSctroumpfDuMois instanceof Schtroumpfette) {
			System.out.println("C'est la princesse !!");
		}
		if (leSctroumpfDuMois instanceof Costaud) {
			System.out.println("C'est la princesse !!");
		}
	}
}
