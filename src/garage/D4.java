package garage;

public class D4 extends Vehicule  {
	private static final long serialVersionUID = 6038836129680367971L;
	
	public D4() {
		super();
	}	
	
	public Marque getMarque()
    {
         return Marque.TROEN;
    }

    public Double getPrix()
    {
        return 25147.0;
    }

    public String getNom()
    {
         return "D4";
    }
}
