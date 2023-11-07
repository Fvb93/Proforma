package exercicessupplementaires;

import fonctions.bonjour;
import fonctions.saisie;
import java.util.Random;

public class devine {

	public static void main(String[] args) {

		int nb,al, cpt=0;
		Random r=new Random();

		bonjour.bonjour("tire un nombre aléatoire compris entre 0 et 100");
		System.out.println("Vous devez deviner ce nombre");

		System.out.println();
		al= r.nextInt(101);
		do {
			nb=saisie.entier(" nombre. Entrer -1 si vous voulez arrêter");
			cpt++;
			if (nb==al)	{ 
				if (cpt==1) {
					System.out.println("Wow quel coup de chance, vous devriez jouer au loto ! ");
					nb=-1;
				}
				else {
					System.out.println("Bravo vous avez deviné le nombre "+al+" en "+cpt+" tentatives !");
					nb=-1;
				}
			} else { 
				if (nb==-1) {
					System.out.println("Aurevoir ! ");
				}
				else {
					System.out.println("Pas de chance ce n'est pas le bon nombre..");
				}
			}
		} while (nb!=-1);
	}
}
