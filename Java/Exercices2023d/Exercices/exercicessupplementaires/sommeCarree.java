package exercicessupplementaires;

import fonctions.bonjour;

public class sommeCarree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bonjour.bonjour("détermine une propriété particulière par rapport à un nombre à 4 chiffres");

		int nb,partie1,partie2=0;
		for (nb=1000;nb<=9999;nb++) {
			partie2= nb%100;
			partie1=(nb-partie2)/100;
			if (nb==(Math.pow(partie1,2) + Math.pow(partie2,2))) {
				System.out.println(nb+ " ");
			}
		}
	}
}



