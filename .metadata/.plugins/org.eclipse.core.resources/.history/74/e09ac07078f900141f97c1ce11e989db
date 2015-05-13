package System;

public abstract class AbsMedia implements MediaImpl {// tout les medias ont un nom, une date de création et un genre
    protected String name;
    protected int year;
    protected String genre[];
    protected int duration;
    
    public AbsMedia (String name, int year, String genre[]){
	this.name = name;
	this.year = year;
	this.genre = genre;
    }
    
    public String[] getGenre(){
	return this.genre;
    }
    public abstract String getType();
}
