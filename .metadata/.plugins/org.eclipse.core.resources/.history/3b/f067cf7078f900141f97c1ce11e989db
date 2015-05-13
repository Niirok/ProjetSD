package System;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class AbsMediaList<T> extends ArrayList {
    public void occurrenceSorting()
	{
	    Comparator<GenreCalc> compNbr = new Comparator<GenreCalc>(){
		    public int compare(GenreCalc g1, GenreCalc g2){
			return g1.getNbr()- g2.getNbr();
		    }
		};   
	Collections.sort(this, compNbr);
	}

}
