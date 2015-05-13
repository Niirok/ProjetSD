package system;

public abstract class AbsVideo extends AbsMedia {
    protected String casting[];
    protected String synop;
    protected String director;
    
    public AbsVideo(String name, int year, String[] genre, String casting[], int duration,String synopsis, String director) {
	super(name, year, genre);
	this.casting = casting;
	this.duration = duration;
	this.synop = synopsis;
	this.director = director;
    }
    public String toString(){ 
	String toReturn ="";
	toReturn += name +"("+year+") \n";
	if(!director.isEmpty())
	    toReturn+="Director: "+director+"\n";
	toReturn+= "Casting: ";
	for(int u =0; u< casting.length;u++){
	    toReturn += casting[u];
	    if (u!= casting.length-1){
		toReturn += ", ";	    
	    }
	}
	toReturn+="\nGenre: ";
	for(int i =0; i< genre.length;i++){
	    toReturn += genre[i];
	    if (i!= genre.length-1)
		toReturn += ", ";
	}
	toReturn+="\nSynonsis: "+synop;
	if(duration!=0){
	    toReturn += "\nDuration: "+ duration+" mins \n";
	}
	return toReturn;
    }
   
}
