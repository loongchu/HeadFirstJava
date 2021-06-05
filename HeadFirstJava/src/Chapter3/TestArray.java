package Chapter3;

public class TestArray {
	public static void main(String[] args) {
		String[] isLands = new String[4];
		int[] index = new int[4];
		index[0] = 1;
		index[1] = 3;
		index[2] = 0;
		index[3] = 2;
		
		isLands[0] = "Bermuda";
		isLands[1] = "Bermud";
		isLands[2] = "Bermu";
		isLands[3] = "Berm";
		
	
		
		int y = 0;
		int ref;
		while(y < 4) {
			ref = index[y];
			System.out.print("island = ");
			System.out.println(isLands[ref]);
			y = y + 1;
		}
		
	}
}
