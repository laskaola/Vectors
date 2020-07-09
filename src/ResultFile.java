import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ResultFile {
	
	private final File file;
	private StringBuffer buff = new StringBuffer();
	
	
	public ResultFile() {
		
		file = new File("result.txt");
		
	}
	
	
	public void saveResultToFile(ArrayList<Integer> res) throws FileNotFoundException {
		
		PrintWriter writer = new PrintWriter(file);
		
				
			buff.append(res);	
		
				
		writer.println("Wynik dodawania wektorów:\n" + buff.toString());
		writer.close();
		
	}
		
	
	public void displaySaving() {
			
		System.out.println("Wynik dodawania wektorów: " + buff.toString());
		System.out.println("Wynik zapisano do pliku \"result\". ");

	}
	
	public void clearBuffer() {
		buff.delete(0, buff.length());
	}

}