package Test;

import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Main {

	public static void main(String[] args) {
		
		Hund milo = new Hund(0, null, null, null, false);
		milo.bellen("WauWau");
		milo.setAlter(7);
		System.out.println(milo.getAlter());
		
		//ArrayListe 
		List<Gebaeude> gebaeudeliste = new ArrayList<Gebaeude>();
		gebaeudeliste.add(new Gebaeude(1, 15.0, "Betriebsgebaeude"));
		gebaeudeliste.add(new Gebaeude(2, 21.0, "Wohngebaeude"));
		gebaeudeliste.add(new Gebaeude(3, 18.0, "Verteilstation"));
		
        ListToFile.writeListToFile(gebaeudeliste, "data.txt");
        FileReaderBeispiel.readAndPrintFile("data.txt");
		

	}
	
	public class ListToFile {
	    public static void writeListToFile(List<Gebaeude> gebeaudeliste, String data) {
	        try {
	        	BufferedWriter writer = new BufferedWriter(new FileWriter(data));
	            for (Gebaeude obj : gebeaudeliste) {
	                writer.write(obj.toString());
	                writer.newLine();
	            }
	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
	    
	    public class FileReaderBeispiel {
	        public static void readAndPrintFile(String fileName) {
	            try {
	                BufferedReader reader = new BufferedReader(new FileReader(fileName));
	                String line;
	                while ((line = reader.readLine()) != null) {
	                    System.out.println(line);
	                }
	                reader.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    
	    
	}
	
}
