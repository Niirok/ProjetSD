package utilisateur;
import java.util.ArrayList;


public class user2{
    
    ArrayList() table = new ArrayList();
    String firstName;
    String lastName;
    String pseudonyme;
    
    static private int nbUser=0;
    ArrayList<int> preference = new ArrayList<int>;
    
    
    public void addPreference(int selection) {
        preference.add(selection);
    }
    
    //Constructeur par default
    public user2() {
        nbUser=nbUser + 1;
        System.out.println("Création d'un nouvel utilisateur");
        this.firstName = "Inconnu";
        this.astName = "Inconnu";
        this.pseudonym= ""nbUser;
        tab.add(pseudonym);
        
    }
    
    // methode qui permet de mettre lecriture clavier ds value avec affichage de ce qui est demande
    public String scan(String display, String value) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrer votre "+display ":");
		String str = sc.nextLine(); //ordi attends le entree
		value=str; 
		sc.close(); //ferme le scanner
    }
    
    public boolean validPseudonym(String pseudonym) {
        boolean notFound=true
        while (notFound) {
            for (i=1, i++, i=nbUser) {
                if (this.pseudonym!=tab(i)) {}
                else (this.pseudonym==tab(i)) {
                    notFound=false
                    return false
                }
            }
            return true
        }
    }
    
    public void user(String lastName, String firstName, String pseudonym) {
        System.out.println("Création d'un nouvel utilisateur");
        nbUser=nbUser + 1;
        scan(prenom, this.firstName);
        scan(nom, this.lastName);
        scan(pseudo, this.pseudonym);
        if (validPseudonym(pseudonym)) {}
        else {
            while (!validPseudonym(pseudonym)) {
                println("Votre pseudo est déjà pris, veuillez changer")
                this.pseudonym="Inconnu"+nbUser
                scan(pseudo, pseudonym)
                
            }
        }
        tab.add(pseudonym);
        System.out.println("Bienvenue "+pseudonym " !")
    }
        
    
    
    
   
}
    
    
