package system;

public class GenreCalc {
    private String genre;
    private int nbr;
    
    public GenreCalc(String genre, int nbr){
	this.genre=genre;
	this.nbr=nbr;
    }
    public String getGenre(){
	return this.genre;
    }
    public int getNbr(){
	return this.nbr;
    }
    public void setGenre(String genre){
	this.genre=genre;
    }
    public void setNbr(int nbr){
	this.nbr=nbr;
    }
    public void add1(){
	this.nbr++;
    }
    public void addn(int n){
	this.nbr+=n;
    }
    public String toString (){
	return genre+" : "+nbr;
    }
}
