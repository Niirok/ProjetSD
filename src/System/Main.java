package System;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException{
	AbsVideoDatabase DB = new AbsVideoDatabase(); 
	DataRead.ReadingFromData(DB);
    }
}
