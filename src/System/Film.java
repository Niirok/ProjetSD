package System;

public class Film extends AbsVideo {
    static String type ="Film";

    public Film(String name, int year, String[] genre, String[] casting, int duration, String director, String synop) {
	super(name, year, genre, casting, duration,synop, director);

    }
   public String toString(){
	return super.toString();
    }
   public String getType(){
	return Film.type;
    }
}
