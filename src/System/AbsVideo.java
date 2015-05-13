package System;

public abstract class AbsVideo extends AbsMedia {
    protected String casting[];
    protected String synop;

    public AbsVideo(String name, int year, String[] genre, String casting[], int duration,String synopsis) {
	super(name, year, genre);
	this.casting = casting;
	this.duration = duration;
	this.synop = synopsis;
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
	toReturn+="\nSynonsis : "+synop;
	return toReturn;
    }
   
}
