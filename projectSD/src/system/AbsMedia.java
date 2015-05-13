//on peut inclure Film et Serie directement dans Media (du coup ca sera plus une classe abstraite)
//car seul le type les differencie, donc creer un String type ?


package system;
public abstract class AbsMedia implements MediaImpl {
	//media= 1 nom, 1 annee, 1/pls genre, 1 duree
    protected String name;
    protected int year;
    protected String genre[];
    protected int duration;
   
    //constructeur 
    public AbsMedia (String name, int year, String genre[]){
	this.name = name;
	this.year = year;
	this.genre = genre;
    }
    
    public String[] getGenre(){
	return this.genre;
    }
    public abstract String getType(); //reference a une fonction qui va etre defini dans une sous classe
    //assure que toutes les sous classe auront une methode implementer getType()
}
