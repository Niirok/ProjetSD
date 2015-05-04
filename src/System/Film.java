package System;

public class Film extends AbsVideo {
    protected String director;
    protected String synop;

    public Film(String name, int year, String[] genre, String[] casting, int duration, String director, String synop) {
	super(name, year, genre, casting, duration);
	this.director = director;
	this.synop = synop;
    }
    
    public String toString(){
	String toReturn = super.toString();
	toReturn += "\nDirector : " + director+"\nSynopsis : "+ synop+".";
	return toReturn;
    }
}
