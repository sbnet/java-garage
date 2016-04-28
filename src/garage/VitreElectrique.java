package garage;

import java.io.Serializable;

public class VitreElectrique implements Option, Serializable {
	private static final long serialVersionUID = -2511552202612236876L;

	public Double getPrix() {
		return 212.35;
	}
	
	public String getNom() {
		return "Vitre electrique";		
	}
}