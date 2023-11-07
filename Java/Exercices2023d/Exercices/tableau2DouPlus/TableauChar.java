package tableau2DouPlus;

import java.util.Scanner;

import fonctions.bonjour;
import fonctions.saisie;
import fonctions.tab;

public class TableauChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char [] []t = new char [5][4];
		char s;

		bonjour.bonjour("affiche un tableau de 5 lignes et 4 colonnes avec les lettres a, b, c, d et e dans un certain ordre.");

		for (int i=0;i<t.length;i++) {
			for (int j=0;j<t[0].length;j++) {
				t[0][j]='a';
				t[1][j]='b';
				t[2][j]='c';
				t[3][j]='d';
				t[4][j]='e';
			}
		}
		tab.affiche(t);

		System.out.println("Vous pouvez changer la première ligne, la deuxième colonne et la quatrième colonne avec le caractère de votre choix");
		s=saisie.saisieChar();
		System.out.println(s);

		for (int i=0;i<t.length;i++) {
			for (int j=0;j<t[0].length;j++) {
				if (i==0) {
					t[i][j]=s;
				}
				if (j==1 || j==3) {
					t[i][j]=s;
				}
			}
		}
		tab.affiche(t);	
	}
}