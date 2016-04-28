package garage;

import java.io.Serializable;

public class GPS implements Option, Serializable{	
	private static final long serialVersionUID = -5054114439418759723L;

	public Double getPrix() {
		return 113.5;
	}
	
	public String getNom() {
		return "GPS";		
	}
}
