package Tableaux;

import java.util.Random;

import fonctions.tab;

public class lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] t = new int [6];
		int [] t2 = new int [45];
		Random r = new Random ();
		int cpt=1;
		int i;

		for (i=0;i<t.length;i++) {
			t[i]= r.nextInt(45)+1;
		}

		for (i=0;i<t.length;i++) {
			while (i<t.length-cpt) {
				if (t[i]==t[t.length-cpt]) {
					t[i] = r.nextInt(45)+1;
					i=0;
				}
				cpt++;	
			} 
			cpt=1;
		}
		
		for (i=0;i<t2.length;i++) {
			t2[i]=i+1;
		}
		
		for (i=0;i<t2.length;i++) {
			for (int j=0;j<t.length;j++) {
				
				if (t2[i]==t[j]) {
					t2[i]=-1;
				}
			}
		}
		  for (i=0;i<t2.length;i++) {
	        	System.out.print((t2[i]==-1?"X":t2[i])+((i+1)%5==0?"\n" :" \t"));
	        }
		  System.out.println("\n");
		  tab.affiche(t);
	}
}

