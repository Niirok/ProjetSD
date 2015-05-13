package utilisateur;
import java.util.ArrayList;
import java.util.Scanner;



public class User {
	public ArrayList<Integer> selection = new ArrayList<>(); 
	public static ArrayList<Integer> listId = new ArrayList<>();
	String firstName;
	String lastName;
	int id;
	static int nbUser=0;
	int filmId;
	
	
	
	//constructeur par défault
	public User(){
			nbUser++;
			System.out.println("Création d'un nouvel utilisateur!");
			firstName = "Inconnu";
			lastName = "Inconnu";
			id = nbUser;
			System.out.println("Notez votre identifiant: "+id);
			listId.add(id);		
	}
	
	public User(String firstName, String lastName) {
		nbUser++;
		System.out.println("Création d'un nouvel utilisateur!");
		this.lastName=lastName;
		this.firstName=firstName;
		id = nbUser;
		System.out.println("Bienvenue "+this.firstName+"!");
		System.out.println("Notez votre identifiant: "+id);
		listId.add(id);
		
	}
	
	public void addSelection() {
		System.out.println("Entrer l'id d'un film que vous voulez ajouter à votre sélection:");
		selection.add(readInt());
	}
	
	//methode qui renvoit un int par lecture clavier
	public int readInt() {
		int value;
		Scanner s = new Scanner(System.in);
		value=s.nextInt(); //ordinateur attends l'entree
		s.close(); //ferme le scanner
		return value;
    }
    
	
	
	

}
