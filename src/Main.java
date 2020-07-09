import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



class Main {

	private static final int NumberOfVectors = 2;
		

	public static void main(String[] args) {
		
		
		ResultFile res = new ResultFile();
		ArrayList<Vector> vectors = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		boolean repeatLoop = true;
		
		String dupa = "UPDATE Students SET wiek = 30, indeks = 22 WHERE name = arkadiusz";
		
		System.out.println(dupa.substring(dupa.indexOf("SET") + 3, dupa.indexOf("WHERE")).trim());
		System.out.println("Enter " + NumberOfVectors + " vectors");
		
		
		for(int i=0; i<NumberOfVectors; i++)
			vectors.add(new Vector());

		
		
		Iterator<Vector> vec = vectors.iterator();
		
		while(repeatLoop) {	
			
			int i = 1;
			
			while(vec.hasNext()) {
			
				System.out.println((i++) + ": ");
				vec.next().setVector(scan);
			}
			
				try {
						result = Vector.addVectors(vectors);
						repeatLoop = false;
				}
						
				catch(WektoryRoznejDlugosciException e) {
						System.out.println("Niestety - " + e);
						System.out.println("Dlugosci wektorow: " + e.getLengths());
						vec = vectors.iterator();
				}
		}				
				
		try {
		res.saveResultToFile(result);
		}
		catch (FileNotFoundException e) {
			System.out.println("Plik nie istnieje");
		}
		res.displaySaving();

	}

}
		