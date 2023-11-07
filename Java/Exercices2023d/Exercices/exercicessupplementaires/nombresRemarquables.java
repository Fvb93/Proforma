package exercicessupplementaires;

import fonctions.bonjour;

public class nombresRemarquables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bonjour.bonjour("détermine si un nombre respecte des conditions particulières en diminuant tout les chiffres dans une équation ");
		int nb;

		for (nb=2;nb<10;nb++) {
			if ( (Math.pow((nb-1), 2)) ==  Math.pow(nb, 2)-11) {
				System.out.println(nb+" en est une car : "+nb+"² = " + Math.pow(nb, 2)+" et "+(nb-1)+"² ="+Math.pow((nb-1), 2));
			}
		}
		for(nb=11;nb<100;nb++) {
			if ( (Math.pow(nb, 2)>1000 && Math.pow((nb-11), 2) ==  Math.pow(nb, 2)-1111) || (Math.pow(nb, 2)<1000 && Math.pow((nb-11), 2) ==  Math.pow(nb, 2)-111)) {
				System.out.println(nb+" en est une car : "+nb+"² = " + Math.pow(nb, 2)+" et "+(nb-11)+"² ="+Math.pow((nb-11), 2));
			}
		}
	}
}