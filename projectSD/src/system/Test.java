package system;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws FileNotFoundException, IOException{
	/*String Tabg[] = {"Action","Comedie"};
	String tabC[] = {"Albert","Bob"};
	Film f1 = new Film("nom au pif", 1993,Tabg,tabC ,120, "le pape"," C'est l'histoire d'un mec");
	System.out.println(f1.toString());*/
	DataRead.ReadingFromData();
    }

}