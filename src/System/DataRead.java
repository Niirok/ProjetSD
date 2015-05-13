package System;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataRead {
    public static void ReadingFromData() throws FileNotFoundException, IOException,NullPointerException{	
	try{
	    String title, director="",synopsis="",titleAndYear,resultread = "";
	    int year, duration,longgenre;
	    String[] casting = null, genre,titleandYearTab, genretemp2;
	    ArrayList<String> genreTemp = new ArrayList();
	    boolean isFilm=true, hasMins= false,isSyn = false,isDir, isCast, hasnotChanged;
	    Scanner input2 = new Scanner(System.in);
	    
	    System.out.println("Please enter the name of datafile : ");	// Asking for a file path 
	    String fileName = input2.next();				//
	    File dataFile = new File(fileName);				//
	    FileReader inputRead = new FileReader(dataFile);		//
	    BufferedReader bufReader = new BufferedReader(inputRead);	// This buffer will be used for parsing.
	    
	    while(resultread.isEmpty())
	        resultread=bufReader.readLine(); //buffer initialization
	    
	    while(bufReader.read()!=-1){ //Whille there is something to read
		titleAndYear = resultread.substring(3).trim();//this string contains ONLY title and year and TV Serie if nedded
		if(titleAndYear.contains("TV Series)")){
		    isFilm=false;
		    titleAndYear=titleAndYear.replace(" TV Series)","");// let us know if this is a TV Serie or not
		}else{							// and trim the string to make parsing easier
		    titleAndYear=titleAndYear.replace(")","");
		}		
		titleandYearTab=titleAndYear.split("\\("); //Sliping title and year
		title = titleandYearTab[0];
		year=Integer.parseInt(titleandYearTab[1]);

		resultread = bufReader.readLine();  // read the next line
		do{				    // this body is here to parse synopsis, director and casting
		    hasnotChanged=true;		    // we stay in this loop while there is information to get
		    if(resultread.contains("Director : ")){ //case for director
			director=resultread.replace("Director : ","");
			isDir = true;
			isSyn = true;
			hasnotChanged =false;
			resultread= bufReader.readLine();// director is on one line only so we can go further
		    }else{
		    if(resultread.contains("With : ")){ //case for the casting
			String[] result2=resultread.replaceFirst("^With : ", "").split(","); //trimming for easier parsing
			casting=result2;
			isCast =true;
			isSyn =true;
			hasnotChanged = false;
			resultread= bufReader.readLine();// casting is on one line only so we can go further
		    }else{
			if(!isSyn){	//is there is no synopsis, then the first line current one is
			synopsis = resultread;
			isSyn =true;
			hasnotChanged = false;
			resultread= bufReader.readLine();//synopsis is on one line only so we can go further
		    }}}
		}while((!hasnotChanged));		   //if there is no new information, exit the loop
		
		genreTemp.clear();			    //just to make sure this list is empty
		genretemp2=resultread.split("\\W");
	        for (String r : genretemp2) {
		    if (r.matches("Sci"))		    //the "-" in Sci-Fi matches \\W...
		        r=r.replace("Sci", "Sci-Fi");
		    if (r.matches("Fi"))
		        r=r.replace("Fi","");
		    if (!r.matches(""))
		        genreTemp.add(r);		    
		    if(r.matches("mins")){		    //some films/Serie don't have a duration
			hasMins=true;
			break;
		    }else{hasMins=false;}
		    }
		if(hasMins){
		    longgenre = genreTemp.size()-2;
		    duration=Integer.parseInt(genreTemp.get(longgenre));
		}else{longgenre = genreTemp.size();
			duration = 0;}
		genre = new String[longgenre];
		for (int n=0;n<longgenre;n++)
		    genre[n]=genreTemp.get(n);
		
		if(isFilm){//If this is a film make a new film, else it'a TV series
		    AbsVideo testfilm = new Film(title,year, genre, casting,duration, director,synopsis);
		    System.out.println(testfilm.toString()+"\n");
		}else{
		    AbsVideo testSerie = new Serie(title,year, genre, casting,duration,synopsis);
		    System.out.println(testSerie.toString()+"\n");    
		}
		resultread=bufReader.readLine(); //go to the next parsable data
		while(resultread.isEmpty())
		    resultread=bufReader.readLine();
		
		isFilm=true;	//
		hasMins= false;	//
		isDir = false;	//
		isCast = false; //
		isSyn = false;	// reinitialization before next loop
	    }
	}catch(FileNotFoundException e){		
	    System.out.println("Something goes wrong, please try again (invalid file Name)");
	    ReadingFromData();
	}catch(NullPointerException n){}
    }
}
