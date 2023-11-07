package tableau2DouPlus;

import java.util.Random;

import fonctions.bonjour;
import fonctions.saisie;
import fonctions.tab;

public class TableauCarreMagique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choix;
		int sommel=0,sommec=0,dia1=0,dia2=0;
		int temp=0;
		boolean magique=true;
		int[][]t = new int[3][3];

		bonjour.bonjour("qui crée un tableau de 3 sur 3. Il permet de vérifier si le tableau est un carré magique ou non");


		for (int i=0;i<t.length;i++) {
			for (int j=0;j<t[0].length;j++) {
				choix=saisie.entier("nombre");
				t[i][j]=choix;
			}
		}
		System.out.println("\nVotre tableau est le suivant\n ");
		tab.affiche(t);

	
		for(int i=0;i<t.length;i++){
		dia1=dia1+t[i][i];
		dia2=dia2+t[i][t.length-1-i];
		}

		if(dia1==dia2){
		    temp=dia1;
		}
		else{
		    magique=false;
		}
		for (int i=0;i<t.length && magique;i++) {      
		    sommel=0;
		    for (int j=0;j<t[0].length;j++) {
		        sommel=sommel+t[i][j];
		    }            
		    magique=(temp==sommel);  
		}
		for (int j=0;j<t[0].length  && magique ;j++) {
		    sommec=0;
		    for (int i=0;i<t.length;i++) {
		        sommec = sommec+t[i][j];
		    }
		      magique=(temp==sommec);
		}
		if (magique) {
		            System.out.println("Votre carré est magique !");
		        }
		        else {
		            System.out.println("Votre carré n'est pas magique !");
		        }
	}
}