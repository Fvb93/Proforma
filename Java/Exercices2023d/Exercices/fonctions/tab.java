package fonctions;

public class tab {


	public static void affiche (int [] t) {
		for (int i=0;i<t.length;i++) {
			System.out.print(t[i]+" \t");
		}
		System.out.println();
	}
	public static void affiche (double [] t) {
		for (int i=0;i<t.length;i++) {
			System.out.print(t[i]+" \t");
		}
		System.out.println();
	}
	public static void affiche (char [] t) {
		for (int i=0;i<t.length;i++) {
			System.out.print(t[i]+" \t");
		}	
		System.out.println();
	}
	public static void affiche (String [] t) {
		for (int i=0;i<t.length;i++) {
			System.out.print(t[i]+" \t");
		}	
		System.out.println();
	}


	
	
	
	public static void affiche (int [] []t) {
		for (int i=0;i<t.length;i++) {
			for (int j=0;j<t[0].length;j++) {
			System.out.print(t[i][j] +(j==(t[0].length)-1?"\n\n":"\t"));
			}
		}
		System.out.println();
	}
	public static void affiche (double[] [] t) {
		for (int i=0;i<t.length;i++) {
			for (int j=0;j<t[0].length;j++) {
			System.out.print(t[i][j] +(j==(t[0].length)-1?"\n\n":"\t"));
			}
		}
		System.out.println();
	}
	public static void affiche (char[] [] t) {
		for (int i=0;i<t.length;i++) {
			for (int j=0;j<t[0].length;j++) {
			System.out.print(t[i][j]+(j==(t[0].length)-1?"\n\n":"\t"));
			}
		}	
		System.out.println();
	}
	public static void affiche (String[] [] t) {
		for (int i=0;i<t.length;i++) {
			for (int j=0;j<t[0].length;j++) {
			System.out.print(t[i][j]+(j==(t[0].length)-1?"\n\n":"\t"));
			}
		}	
		System.out.println();
	}
}
