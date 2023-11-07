package tableau2DouPlus;

import java.util.Random;

import fonctions.bonjour;
import fonctions.saisie;
import fonctions.tab;

public class SommeDiagonale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random (); 
		int dia1 = 0, dia2=0;

		bonjour.bonjour("qui crée un tableau de 4 lignes et 4 colonnes avec des nombres aléatoires puis calcule la valeur de chaque diagonale");


		int[][]t = new int[4][4];

		for (int i=0;i<t.length;i++) {
			for (int j=0;j<t[0].length;j++) {
				t[i][j]=r.nextInt(21);
			}
		}
		tab.affiche(t);

		for (int i=0;i<t.length;i++) {
	        dia1=dia1+t[i][i];
	        dia2=dia2+t[i][t.length-1-i];
	        }
		
		System.out.println("La valeur de la diagonale allant du coin supérieur gauche au coin inférieur droit et de "+dia1);
		System.out.println("La valeur de la diagonale allant du coin supérieur droit au coin inférieur gauche et de "+dia2);
	}
}
