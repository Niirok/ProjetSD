package System;

public class Film extends AbsVideo {
    static String type ="Film";
    protected String director;


    public Film(String name, int year, String[] genre, String[] casting, int duration, String director, String synop) {
	super(name, year, genre, casting, duration,synop);
	this.director = director;
    }
    
    public String toString(){
	String toReturn = super.toString();
	toReturn += "\nDirector : " + director;
	return toReturn;
    }
   public String getType(){
	return Film.type;
    }
}
