package garage;

import java.io.Serializable;

public class SiegeChauffant implements Option, Serializable {
	private static final long serialVersionUID = 848521009345041098L;

	public Double getPrix() {
		return 562.9;
	}
	
	public String getNom() {
		return "Siège chauffant";		
	}
}
