package System;
import java.util.ArrayList;

public class MediaSelection {
    private ArrayList<AbsMedia> ViewedMedia;
    
    public void add(AbsMedia toAdd){
	this.ViewedMedia.add(toAdd);
    }
    public void delete(AbsMedia toDelete){
	this.ViewedMedia.add(toDelete);
    }
    public String toString(){
	String toReturn="";
	for(int i =0; i< this.ViewedMedia.size();i++){
	    toReturn += this.ViewedMedia.get(i).toString();
	    toReturn += "\n";
	}
	return toReturn;
    }
}
