import java.awt.*;
import java.lang.Math;
import java.util.Random;

public class BFSRunner {
	
	private static String BLOCKED_FIELD = "x";
	private static String EMPTY_FIELD = ".";
	private String[][] field;
	
	public static void main(String[] args) {
		String[][] ran = randomField(5,5);
	//	BreadthFirstSearch search = new BreadthFirstSearch(
		
		//System.out.print(5+"fooo");
	}
	
	public static String[][] randomField(int x, int y){
		String[][] field = new String[x][y];
		Random r = new Random();
		
		for(int i=0; i<field.length; i++) {
			for(int k=0; k<field[i].length; k++) {
				int n = (int)(r.nextInt(2))+1;
				switch (n) {
					case 1: field[i][k] = BLOCKED_FIELD;
							break;
					
					case 2: field[i][k] = EMPTY_FIELD;
							break;
				}	
			}
		}
		field[0][0] = EMPTY_FIELD;
		field[5][5] = EMPTY_FIELD;
		
		return field;
	}
}
