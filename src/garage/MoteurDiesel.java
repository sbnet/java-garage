package garage;

public class MoteurDiesel extends Moteur {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7196257656696089286L;

	public MoteurDiesel(String cylindre, Double prix) {
		setCylindre(cylindre);
		setPrix(prix);
	}

	public TypeMoteur getType() {
        return TypeMoteur.DIESEL;
     
    }
}