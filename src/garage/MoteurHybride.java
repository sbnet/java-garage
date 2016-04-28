package garage;

public class MoteurHybride extends Moteur {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6637296937155523861L;

	public MoteurHybride(String cylindre, Double prix) {
		setCylindre(cylindre);
		setPrix(prix);
	}

	public TypeMoteur getType() {
        return TypeMoteur.HYBRIDE;
     
    }
}
