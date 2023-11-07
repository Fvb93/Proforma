package Tableaux;

import fonctions.bonjour;
import fonctions.saisie;
import fonctions.tab;

public class DoubleNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bonjour.bonjour("va vous faire remplir un tableau de 10 nombres afin de les doubler");
		int [] t = new int [10];

		for (int i=0;i<t.length;i++) {
			t[i]= saisie.entier("nombre "+(i+1));
		}
		tab.affiche(t);
		
		for (int i=0;i<t.length;i++) {
			t[i]=2*t[i];
		}
		tab.affiche(t);
	}
}
