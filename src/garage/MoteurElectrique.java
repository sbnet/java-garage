package garage;

public class MoteurElectrique extends Moteur {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8801870079768315035L;

	public MoteurElectrique(String cylindre, Double prix) {
		setCylindre(cylindre);
		setPrix(prix);
	}
	
	public TypeMoteur getType() {
        return TypeMoteur.ELECTRIQUE;
     
    }
}