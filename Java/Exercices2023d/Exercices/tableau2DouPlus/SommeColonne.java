package tableau2DouPlus;

import java.util.Random;

import fonctions.bonjour;
import fonctions.tab;

public class SommeColonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] []t = new int [3][4];
		Random r = new Random (); 
		int somme=0;

		bonjour.bonjour("affiche un tableau de 3 lignes et 4 colonnes avec des nombres aléatoires et qui calcule le total de chaque colonne");

		for (int i=0;i<t.length;i++) {
			for (int j=0;j<t[0].length;j++) {
				t[i][j]=r.nextInt(11)+10;
			}
		}
		tab.affiche(t);
		
		for (int j=0;j<t[0].length;j++) {
			somme=0;
			for (int i=0;i<t.length;i++) {
				somme = somme+t[i][j];
				if (i==t.length-1)
				{
					System.out.println("Le total de la colonne "+(j+1)+" est de "+somme);
				}
			}
		}
	}
}