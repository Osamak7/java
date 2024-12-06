import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Locale;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US); // configuro il pc in Americano cosi che i numeri siano delimitati da '.' e non ','
		
		// Create una lista con 10 elementi Wifi casuali
		LinkedList<WiFi> lwifi = new LinkedList<WiFi>();
		for (int i = 0; i < 10; i++) {
			lwifi.add(WiFi.MakeWifi());
		}

		System.out.println(lwifi);
		
		// Domanda:La potreste stampare in formato CSV poiché
		// dobbiamo passarla al vostro collega Onisa?
		
		
		var fl = Util.OpenFileForWriting("1.csv");
		String car = "";
		for (var x : lwifi) {
			car += String.format("%s,%s,%s,%f\n", 
					x.getId(), x.getProtocollo(), x.getPassword(), x.getFrequenza());
			
		}
		fl.write(car);
		fl.close();
		
		System.out.println(lwifi);
		// svoto la lista 
		lwifi.clear();
		
		BufferedReader fin = Util.OpenFileForReading("1.csv");
		System.out.println(lwifi);
		
		String riga = fin.readLine();
		while (riga != null) {
			//uso la riga e poi leggo la succesiva
			
			String[] items = riga.split(",");
			WiFi it = new WiFi(items[0],items[1],items[2],Double.parseDouble(items[3]));
			lwifi.add(it);
			riga = fin.readLine();
			
		}
		fin.close();
		
		System.out.println(lwifi);
		
		
				
		WiFi appo = WiFi.MakeWifi();
		String jsonString;
		
		ObjectMapper objectMapper = new ObjectMapper();
		jsonString = objectMapper.writeValueAsString(appo);
		System.out.println(jsonString);
		WiFi nuovo = objectMapper.readValue(jsonString, WiFi.class);
		System.out.println(nuovo);
		
		// Salvate sul file la wifi ma sta volta in formato json e non csv e poi la rileggete da capo
		
		fl = Util.OpenFileForWriting("1.txt");
		for (var x : lwifi) {
			WiFi car2 = objectMapper.readValue(riga, WiFi.class);
			objectMapper.writeValueAsString(x);
			
		}
		fl.write();
		fl.close();
		System.out.println(fl);
	}

}
