package garage;

import java.io.Serializable;

public class Moteur implements Serializable {
	private static final long serialVersionUID = -6185900810815882232L;
	public TypeMoteur type;
	protected String cylindre;
	protected Double prix;
	
	public Moteur() {}
	
	public Moteur(String pCylindre, Double pPrix) {
		cylindre = pCylindre;
		prix = pPrix;
	}

	public String toString(){
		return "Moteur " + getType() + " " + this.cylindre;
	}
	
	public Double getPrix() {
		return prix;
	}
	
	public void setCylindre(String pCylindre) {
		cylindre = pCylindre;
	}

	public void setPrix(Double pPrix) {
		prix = pPrix;
	}
	
	public TypeMoteur getType() {
        return type;     
    }
}
