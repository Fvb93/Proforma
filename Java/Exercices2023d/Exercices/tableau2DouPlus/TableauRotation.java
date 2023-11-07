package tableau2DouPlus;

import java.util.Random;

import fonctions.bonjour;
import fonctions.saisie;
import fonctions.tab;

public class TableauRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Random r = new Random (); 
		int choix;
		int temp;
		int[][]t = new int[4][4];

		bonjour.bonjour("qui crée un tableau de 3 lignes sur 3 colonnes puis va effectuer une rotation");
		do {
			choix=saisie.entier("choix. Taper 1 pour une rotation dans le sens horlogé. Taper 2 pour une rotation trigonométrique. ");
		} while (choix!=1 && choix!=2);



		for (int i=0;i<t.length;i++) {
			for (int j=0;j<t[0].length;j++) {
				t[i][j]=r.nextInt(21);
			}
		}
		tab.affiche(t);

		System.out.println("Petit tour de magie et hop !\n");

		if (choix==1) {     // rotation horlogé
			for (int i=0;i<1;i++) {
				for (int j=t[0].length-1;j>=0;j--) {
					System.out.print(""+t[j][i]+"\t"); 
				}
			}
			System.out.println("\n");

			for (int i=1;i<2;i++) {
				for (int j=t[0].length-1;j>=0;j--) {
					System.out.print(""+t[j][i]+"\t"); 
				}
			}

			System.out.println("\n");
			for (int i=2;i<3;i++) {
				for (int j=t[0].length-1;j>=0;j--) {
					System.out.print(""+t[j][i]+"\t"); 
				}
			}
		} 
		else { // rotation trigonométrique
			for (int i=t.length-1;i>t.length-2;i--) {
				for (int j=0;j<t[0].length;j++) {
					System.out.print(""+t[j][i]+"\t"); 
				}
			}
			System.out.println("\n");

			for (int i=t.length-2;i>t.length-3;i--) {
				for (int j=0;j<t[0].length;j++) {
					System.out.print(""+t[j][i]+"\t"); 
				}
			}

			System.out.println("\n");
			for (int i=t.length-3;i>t.length-4;i--) {
				for (int j=0;j<t[0].length;j++) {
					System.out.print(""+t[j][i]+"\t"); 
				}
			}
		}	
	}
}



