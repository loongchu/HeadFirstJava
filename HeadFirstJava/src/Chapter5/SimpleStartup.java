package Chapter5;

import java.util.ArrayList;

public class SimpleStartup {
	private ArrayList<String> locationCells;
	// int numOfHits = 0;
	// don't need numOfHits that now
	
	public void setLocationCells(ArrayList<String> loc) {
		locationCells = loc;
	}
	
	public String checkYourself(String userInput) {
		//int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		int index = locationCells.indexOf(userInput);
//		for(int cell:locationCells) {
//			if(guess == cell) {
//				result = "hit";
//				numOfHits++;
//				break;
//			}
//		}
//		if(numOfHits == locationCells.length) {
//			result = "kill";
//		}
		if(index >= 0) {
			locationCells.remove(index);
			if(locationCells.isEmpty()) {
				result = "kill";
			}else {
				result = "hit";
			}
		}
		return result;
	}
	
	
	}

