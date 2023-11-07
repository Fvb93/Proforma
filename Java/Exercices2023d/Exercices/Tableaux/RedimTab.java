package Tableaux;

import java.util.Scanner;

import fonctions.bonjour;
import fonctions.saisie;
import fonctions.tab;

public class RedimTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] t = new int [10];
		int cpt=0;
		int temp;
		int nbe=0;

		bonjour.bonjour("va vous faire remplir un tableau de 10 nombres compris entre 0 et 5");
		for (int i=0;i<t.length;i++) {
			t[i]= saisie.entier("nombre "+(i+1));
			while (t[i]<0 || t[i]>5) {
				System.out.println("Votre nombre n'est pas compris entre 0 et 5, recommencez");
				t[i]=new Scanner(System.in).nextInt();
			}
		}
		tab.affiche(t);

		for (int i=0;i<t.length-1;i++) {
			if (t[i]==0 && cpt!=t.length-1) {
				temp=i;
				cpt++;
				do {
					t[i]=t[i+1];
					i++;
					if (t[t.length-1]==0) {
						t[t.length-1]=9;
						cpt++;
					}
				} while (i<t.length-1);
				i=temp-1;
			}
		}
		if (cpt==9) {
			cpt++;
		}

		for (int i=0;i<t.length-cpt;i++) {
			nbe++;
		}
		for (int i=t.length-cpt;i<t.length;i++) {
			t[i]=0;
		}
		tab.affiche(t);
		System.out.println(cpt);
		System.out.println(nbe);

		int [] t2 = new int [nbe];
		if (nbe<10) {
			for (int i=0;t[i]!=0;i++) {
				if (t[i]!=0) {
					t2[i]=t[i];
				}
			}
			tab.affiche(t2);
		}
		else {
			tab.affiche(t);	
		}

	}
}

