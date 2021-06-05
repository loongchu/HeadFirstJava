package Test;

class Player{
	static int playerCount = 0;
	private String name;
	public Player(String n) {
		name = n;
		playerCount++;
	}
}

public class PlayerTestDrive {
	static public void main(String[] args) {
		System.out.println(Player.playerCount);
		Player one = new Player("Toger Woods");
		System.out.println(Player.playerCount);
	}
}
