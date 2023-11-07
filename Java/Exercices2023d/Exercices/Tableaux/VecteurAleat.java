package Tableaux;

import java.util.Random;

import fonctions.tab;

public class VecteurAleat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] t = new int [10];
		Random r = new Random ();
		
		for (int i=0;i<t.length;i++) {
			t[i]= r.nextInt(31);
		}
		tab.affiche(t);
	}
}
