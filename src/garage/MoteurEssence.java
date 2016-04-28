package garage;

public class MoteurEssence extends Moteur {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3613738784249925540L;

	public MoteurEssence(String cylindre, Double prix) {
		setCylindre(cylindre);
		setPrix(prix);
	}

	public TypeMoteur getType() {
        return TypeMoteur.ESSENCE;
     
    }
}
