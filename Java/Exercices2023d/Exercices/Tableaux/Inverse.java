package Tableaux;

import fonctions.bonjour;
import fonctions.saisie;
import fonctions.tab;

public class Inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] t = new int [10];
		int temp=0;
		bonjour.bonjour("va vous faire remplir un tableau de 10 nombres afin de les inverser au niveau de leur position");

		for (int i=0;i<t.length;i++) {
			t[i]= saisie.entier("nombre "+(i+1));
		}
		tab.affiche(t);

		for (int i=0;i<(t.length/2);i++) {
			temp=t[i];
			t[i]= t[t.length-1-i];
			t[t.length-1-i]=temp;
		}
		tab.affiche(t);
	}
}