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
    public String toString(){ 
	String toReturn ="";
	toReturn += name +"\nYear : "+year+"\nGenre : ";
	for(int i =0; i< genre.length;i++){
	    toReturn += genre[i];
	    if (i!= genre.length-1){
		toReturn += ", ";
	    }else{if(duration!=0){
		toReturn += "\nDuration : "+ duration+"\n";
		    }else{
			toReturn += "\nDuration : unknown\n";
		    }
	    }
	}
	return toReturn;
    }
    public String[] getGenre(){
	return this.genre;
    }
    public abstract String getType();
}
