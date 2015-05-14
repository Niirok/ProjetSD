package gui;

import java.io.FileNotFoundException;
import java.io.IOException;
import system.AbsVideoDatabase;
import static system.DataRead.ReadingFromData;

public class interfaceresolve {
    private AbsVideoDatabase db;

    interfaceresolve(MainFrame mainFrame) {
       this.db= new AbsVideoDatabase();
    }

    
    public void resolve(MainFrame frame) throws IOException,FileNotFoundException{
        db = new  AbsVideoDatabase();
        ReadingFromData(this.db,frame.getNomFichier());
        frame.getDataBaseDisplay().setText(this.getDB().toString());
        System.out.println("prout");
    }
    
    public AbsVideoDatabase getDB(){
        return this.db;
    }
}
