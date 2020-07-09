
import java.util.ArrayList;

public class WektoryRoznejDlugosciException extends Exception {
	

	private ArrayList<Integer> lengths = new ArrayList<Integer>();
	
	
	public WektoryRoznejDlugosciException(ArrayList<Vector> input, String msg) {
		
		super(msg);
		
		for (int i=0; i<input.size(); i++) {
			
			lengths.add(input.get(i).getVectorLength());
		}
	}
	
	public ArrayList<Integer> getLengths(){
		return lengths;
	}
	
}
