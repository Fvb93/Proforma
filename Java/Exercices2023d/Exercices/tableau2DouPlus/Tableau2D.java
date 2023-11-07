package tableau2DouPlus;

import java.util.Random;

import fonctions.bonjour;
import fonctions.saisie;
import fonctions.tab;

public class Tableau2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] []t = new int [4][5];
		Random r = new Random (); 

		bonjour.bonjour("affiche un tableau de 4 lignes et 5 colonnes avec des nombres compris entre 10 et 20");

		for (int i=0;i<t.length;i++) {
			for (int j=0;j<t[0].length;j++) {
				t[i][j]=r.nextInt(11)+10;
			}
		}
		tab.affiche(t);
	}
}