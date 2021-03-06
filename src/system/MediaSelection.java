package system;
import java.util.ArrayList;

public class MediaSelection {
    private ArrayList<AbsMedia> ViewedMedia;
    private ArrayList<GenreCalc> representedGenre;
    
    public void add(AbsMedia toAdd){
	this.ViewedMedia.add(toAdd);
    }
    public void delete(AbsMedia toDelete){
	this.ViewedMedia.add(toDelete);
    }
    public String toString(){
	String toReturn="";
	for (AbsMedia ViewedMedia1 : this.ViewedMedia) {
	    toReturn += ViewedMedia1.toString() + "\n";
	}
	return toReturn;
    }
    public void MajorityofVideo(){ // le but de cette fonction est de trié les préférences d'un utilisateur
	String typeac;
	boolean treated = false;
	for (AbsMedia a : this.ViewedMedia){
	    if (a instanceof AbsVideo ){
		typeac = a.getType();
		for( int i =0; i< representedGenre.size()|| treated; i++){
		    if(representedGenre.get(i).getGenre().equalsIgnoreCase(typeac)){
			representedGenre.get(i).add1();
			treated = true;
		    }
		    if(i==representedGenre.size()&&!treated){
			representedGenre.add(new GenreCalc(typeac,1));
			treated=true;
		    }
		    //TODO :: representedGenre.toString();
		   
		}
	    }
	}
	
    
    };
}
