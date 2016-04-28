package garage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Garage {
	List<Vehicule> voitures = new ArrayList<Vehicule>();
	
	public Garage() {
		/* lecture du fichier pour initialiser le garage */
		ObjectInputStream ois;

		try {
		      ois = new ObjectInputStream(
		              new BufferedInputStream(
		                new FileInputStream(
		                  new File("garage.dat"))));
		            
		      try {
				voitures = (List<Vehicule>)ois.readObject();
		      } catch (ClassNotFoundException e) {
		        e.printStackTrace();
		      }
			
		      ois.close();		        	
	    } catch (FileNotFoundException e) {
	      //e.printStackTrace();
	    } catch (IOException e) {
	      e.printStackTrace();
	    }     				
	}
	
	public String toString(){
		String message = "*************************\n"
				       + "* Garage OpenClassrooms *\n"
				       + "*************************\n";
		
		if(voitures.isEmpty()) 
		{
			message += "Aucune voiture sauvegardée !";
		}
		else
		{
			/* liste les voiture */
			for(Vehicule v: voitures)
			{
				message += "+ Voiture " + v.toString() + "\n";
			}
		}
		
		return message;	
	}
	
	public void addVoiture(Vehicule voit){
		/* On commence par ajouter la voiture à la liste */
		voitures.add(voit);
		
		/* On sauvegarde la liste dans le fichier */		
	    ObjectOutputStream oos;
	    try {	    	
	    	oos = new ObjectOutputStream(
	    			new BufferedOutputStream(
	    			  new FileOutputStream(
	    			    new File("garage.dat"))));
	      	      
	      //Nous allons écrire la collection voitures dans le fichier
	      oos.writeObject(voitures);

	      //Ne pas oublier de fermer le flux !
	      oos.close();
	        		        	
	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    } catch (IOException e) {
	      e.printStackTrace();
	    }     		  
	}
}
