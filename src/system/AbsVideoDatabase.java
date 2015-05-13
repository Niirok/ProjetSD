package system;

import java.util.ArrayList;

public class AbsVideoDatabase {
   public ArrayList<AbsVideo> VidDB;
        
    public ArrayList<AbsVideo> getVideoDB(){
	return this.VidDB;
    } 
    public AbsVideoDatabase(){
	this.VidDB = new ArrayList();
    };
    
    public void add(AbsVideo toAdd){
       this.VidDB.add(toAdd);
    }
  
   @Override
    public String toString(){
	String toReturn="";
       for (AbsVideo VidDB1 : VidDB) {
	   toReturn += VidDB1.name + " \n";
       }
	return toReturn;
    }
    
    
}
