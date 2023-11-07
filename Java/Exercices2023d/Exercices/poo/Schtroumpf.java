package poo;

public class Schtroumpf {

	private String nom="Schtroumpf"; // encapsulation respectée, c'est une variable d'instance
	private static int nb=0; 

	public String getNom() { // création de getteur
		return nom;
	}

	public void setNom(String aNom) { // création du setteur
		if (aNom.equals(""))
			aNom="Schtroumpf";
		this.nom = aNom; // this représente l'instance ou l'objet
	}

	public static int getNb() {
		return nb;
	}

	public static void setNb(int aNb) {
		if(aNb<0)
			aNb=-aNb;
		Schtroumpf.nb = aNb; // Une variable static est appellée variable partagée et variable de classe (unicité)
	}
	
	public void dessine() {
		System.out.println("Je suis bleu avec un short et un bonnet blanc");
	}
	public void parle() {
		System.out.println("Je schtroumpfe le schtroumpfe et je me schtroumf "+nom);
	}
	public Schtroumpf() { // constructeur
		nb++;
	}
	public Schtroumpf(String prenom) { // constructeur
		nb++;
		setNom(prenom);
	}
}
