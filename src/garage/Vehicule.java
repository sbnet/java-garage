package garage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Vehicule implements Serializable {
	private static final long serialVersionUID = 7802203949649735275L;
	protected Double prix;
	protected String nom;
	protected List<Option> options;
	protected Marque nomMarque;
	protected Moteur moteur;

	public Vehicule() {
		options = new ArrayList<Option>();
	}
	
	public String toString() {
		
		String str = getMarque() + " : " + getNom() 
			+ " " + moteur.toString() + " (" + getPrix() + "€) "
            + " [";
		
		String listeOptions = "";
		Double totalOptions = 0.0;
		for(Option o: getOptions())
        {
	        listeOptions += o.getNom() + " (" + o.getPrix() + "€)";
	        totalOptions += o.getPrix();		    
        }
        Double total = getPrix() + totalOptions;
        str += listeOptions + "] d'une valeur totale de " + total + "€";		

        return str;	
	}
	
	public void addOption(Option opt) {
		options.add(opt);
	}

	public Marque getMarque() {
		return nomMarque;
	}
	
	public String getNom() {
		return nom;
	}
	
	public List<Option> getOptions() {
		return options;
	}
	
	public Double getPrix() {
		return prix;
	}

	public void setMoteur(Moteur pMoteur) {
		moteur = pMoteur;
	}
}
