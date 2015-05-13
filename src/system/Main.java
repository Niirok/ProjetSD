package system;

import gui.MainFrame;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException{
	//AbsVideoDatabase DB = new AbsVideoDatabase(); 
	//DataRead.ReadingFromData(DB);
        MainFrame fenetre = new MainFrame();
        
        fenetre.setVisible(true);
    }
}
