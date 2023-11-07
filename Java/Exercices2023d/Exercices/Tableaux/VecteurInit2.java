package Tableaux;

import java.util.Random;

import fonctions.tab;

public class VecteurInit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] t = new int [20];

		for (int i=0;i<t.length;i++) {
			t[i]= 2*i;
		}
		
        for (int i=0;i<t.length;i++) {
        	if((i+1)%5==0) {
        		System.out.println(t[i]);
        	}
        	else {
        		System.out.print(t[i]+" \t");
        	}
        }
        System.out.println("---------en encore plus court");
        for (int i=0;i<t.length;i++) {
        	
        	System.out.print(t[i]+((i+1)%5==0?"\n" :" \t"));
        }
    }
}