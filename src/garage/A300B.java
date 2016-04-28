package garage;

public class A300B extends Vehicule {
	private static final long serialVersionUID = 6282675152342918074L;

	public A300B() {
		super();
	}	
	
	public Marque getMarque()
    {
         return Marque.PIGEOT;
    }

    public Double getPrix()
    {
        return 28457.0;
    }

    public String getNom()
    {
         return "A300B";
    }
}
