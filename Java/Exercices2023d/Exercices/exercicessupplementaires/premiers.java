package exercicessupplementaires;

import fonctions.bonjour;

public class premiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nb,div;

		bonjour.bonjour("affiche les nombres premiers inférieurs à 200");

		for (nb=1;nb<=200;nb++) {
			for (div=2;div<nb;div++) {
				if (nb%div==0) {
					div=nb;
				}
				else {
					if (div==nb-1 && nb%div!=0) {
						System.out.print(nb+"\t");
					}
				}
			}
		}
	}
}
