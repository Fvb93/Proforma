package Tableaux;

import fonctions.bonjour;
import fonctions.saisie;
import fonctions.tab;

public class Tri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] t = new int [10];
		int temp=0;
		boolean changement;
		bonjour.bonjour("va vous faire remplir un tableau de 10 nombres puis les trier par ordre croissant");

		for (int i=0;i<t.length;i++) {
			t[i]= saisie.entier("nombre "+(i+1));
		}
		tab.affiche(t);

		do {
			changement =false;
		for (int i=0;i<(t.length)-1;i++) {
			if (t[i]>t[i+1]) {
				temp=t[i];
				t[i]= t[i+1];
				t[i+1]=temp;
				changement = true;
			}
		}
		} while (changement);
		tab.affiche(t);
	}
}
