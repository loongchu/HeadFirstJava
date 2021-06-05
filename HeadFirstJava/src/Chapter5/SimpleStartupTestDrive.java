package Chapter5;

import java.util.ArrayList;

public class SimpleStartupTestDrive {
	public static void main(String[] args) {
		int numOfGuesess = 0;
		SimpleStartup theStartup = new SimpleStartup();
		GameHelper helper = new GameHelper();
		
		int randomNum = (int) (Math.random() * 5);
		
		int[] locations = {randomNum, randomNum+1, randomNum+2};
		
		//theStartup.setLocationCells(locations);
		boolean isAlive = true;
		
		while(isAlive == true) {
			String guess = helper.getUserInput("enter your number");
			String result = theStartup.checkYourself(guess);
			numOfGuesess++;
			
			if(result.equals("kill")) {
				isAlive = false;
				System.out.println("You took " + numOfGuesess + " guesess");
			}
		}
		
	}
}
