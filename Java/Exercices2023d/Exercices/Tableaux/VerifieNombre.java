package Tableaux;

import fonctions.bonjour;
import fonctions.saisie;
import fonctions.tab;

public class VerifieNombre {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nb;
		int [] t = new int [10];
		boolean present = false;
		bonjour.bonjour("va vous faire remplir un tableau de 10 nombres et vérifier si un des nombres saisis est présent");

		for (int i=0;i<t.length;i++) {
			t[i]= saisie.entier("nombre "+(i+1));
		}
		tab.affiche(t);

		do {
			nb=saisie.entier("nombre ");
			for (int i=0;i<t.length;i++) {
				if (nb==t[i]) {
					System.out.println("Vrai, votre nombre se trouve en position "+i);
					present = true;
				}
			}
				if (!present) {
					System.out.println("Faux");
				}
		} while (!present);
	}
}