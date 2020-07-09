import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

class Vector {
	
	private ArrayList<Integer> vector = new ArrayList<Integer>();
	private int vectorLength;
	
	public Vector() {
		
		vectorLength = 0;
	}
	
	
		public void setVector(Scanner Scan){
			
			boolean repeatLoop = true;
			vector.clear();
			
			while(repeatLoop) {
				try {
					
					String vecValuesString = Scan.nextLine();
					Scanner intScan = new Scanner(vecValuesString);
					int length = vecValuesString.split(" ").length;
					
					
						for (int i=0; i<length; i++) {
							
							vector.add(intScan.nextInt());
						}
						
						intScan.close();
						vectorLength = vector.size();
						repeatLoop = false;
				}
				catch(InputMismatchException e) {
					System.out.println("Mo¿esz wpisaæ tylko liczby.");
					System.out.println("Spróbuj jeszcze raz:");
					vector.clear();
				}
			}
						
			}
		
	public static ArrayList<Integer> addVectors(ArrayList<Vector> input) throws WektoryRoznejDlugosciException {
			
		ArrayList<Integer> result = new ArrayList<>();	
		
			if(!isVectorsLengthEqual(input)) {
					throw new WektoryRoznejDlugosciException(input, "Wektory roznej dlugosci");
			}
			else {
				Iterator<Vector> v = input.iterator();
				
				for(int i=0; i<input.get(0).vectorLength; i++) {
					
					int r = 0;
					
					while(v.hasNext()) {	
						
						r = r + v.next().vector.get(i);
					}
					
					result.add(r);
					v = input.iterator();
				}
			}
				return result;
		}
	
	
	public static boolean isVectorsLengthEqual(ArrayList<Vector> input) {
		
		boolean isEqual = true;
		
		for(int i=0; i<(input.size() - 1); i++) 
	
			isEqual = isEqual && new Integer(input.get(i).vectorLength).equals(input.get(i+1).vectorLength);
	
		return isEqual;
	}
		
	public ArrayList<Integer> getVectorValues() {
		
		return vector;
	}
	
	public int getVectorLength() {
		
		return vectorLength;
	}
	
	
		
}
