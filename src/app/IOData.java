package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class IOData  {
	public static <T> void writeToFile(ArrayList<T> A,String filename) throws IOException {
		BufferedWriter strToFile = new BufferedWriter(new FileWriter(filename));
		for (int i = 0; i < A.size(); i++) {
			strToFile.write(A.get(i).toString());
			strToFile.newLine();
		}
		strToFile.close();
	}
	
	public static String readFromFile(String file) throws IOException{
		String tmpStr;
		String svar = "";
		BufferedReader strFromFile = new BufferedReader(new FileReader(file));
		while ((tmpStr = strFromFile.readLine()) != null) {
			svar += tmpStr + "\n";
		}
		strFromFile.close();
		return svar;
	}
	
}
