package System;

public abstract class AbsVideo extends AbsMedia {
    protected String casting[];

    public AbsVideo(String name, int year, String[] genre, String casting[], int duration) {
	super(name, year, genre);
	this.casting = casting;
	this.duration = duration;
    }
    public String toString(){ 
	String toReturn = super.toString();
	toReturn += "Casting : ";
	for(int u =0; u< casting.length;u++){
	    toReturn += casting[u];
	    if (u!= casting.length-1){
		toReturn += ", ";	    
	    }
	}
	return toReturn;
    }
    
   
}
