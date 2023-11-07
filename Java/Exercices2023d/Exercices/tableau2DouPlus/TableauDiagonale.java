package tableau2DouPlus;



import fonctions.bonjour;
import fonctions.saisie;
import fonctions.tab;

public class TableauDiagonale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int choix;

		bonjour.bonjour("qui vous demande d'introdruire le nombre de lignes/colonnes d'une matrice carrée (chaque élément aura la valeur du nombre de lignes/colonnes) afin de rendre les diagonales égalent à 0");
		choix=saisie.entier("de lignes/colonnes");

		int[][]t = new int[choix][choix];

		for (int i=0;i<t.length;i++) {
			for (int j=0;j<t[0].length;j++) {
				t[i][j]=choix;
			}
		}
		tab.affiche(t);

		  for (int i=0;i<t.length;i++) {
              t[i][i]=0;
              t[i][t.length-1-i] =0;
       
    }
		tab.affiche(t);
	}
}

