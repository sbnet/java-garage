package garage;

import java.io.Serializable;

public class BarreDeToit implements Option, Serializable {
	private static final long serialVersionUID = 7529154173323284794L;

	public Double getPrix() {
		return 29.9;
	}
	
	public String getNom() {
		return "Barre de toit";		
	}
}
