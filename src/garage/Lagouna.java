package garage;

public class Lagouna extends Vehicule {
	private static final long serialVersionUID = 7693364795489911452L;

	public Lagouna() {
		super();
	}	
	
	public Marque getMarque()
    {
         return Marque.RENO;
    }

    public Double getPrix()
    {
        return 23123.0;
    }

    public String getNom()
    {
         return "Laguna";
    }
}
