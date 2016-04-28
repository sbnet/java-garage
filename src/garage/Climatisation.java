package garage;

import java.io.Serializable;

public class Climatisation implements Option, Serializable {
	private static final long serialVersionUID = -1161860127850041186L;

	public Double getPrix() {
		return 347.3;
	}
	
	public String getNom() {
		return "Climatisation";		
	}
}
