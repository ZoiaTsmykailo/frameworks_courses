
import java.util.Random;
import java.util.Scanner;;
public class Game {
	Random random = new Random();
	private int number;
	public int generateNumber() {
		return random.nextInt(21);
	}
	public void newGame() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scaner = new Scanner(System.in);
		Game game = new Game();
		int numberScaner;
		int count = 0;
		String leaveGame = "q";
		System.out.println("Enter a number from 1 to 20 and press enter");
		int number = game.generateNumber();
		while(scaner.hasNext() && !scaner.equals(leaveGame)) {
		if(scaner.hasNextInt()) {
			numberScaner = scaner.nextInt();
			if(number==numberScaner) {
				System.out.println("you won!!!");
				System.out.println("unknown number: " + number);				
				count++;
				System.out.println("number of turns: " + count);
				int flag = 0;
				System.out.println("Do you  want to play more? enter - " + flag);
				int nextGame = scaner.nextInt();
				if(nextGame == 0) {
					number = game.generateNumber();
					count = 0; 	
				} else break;
			} else if(number < numberScaner) {
				System.out.println("plans a number less than");
				count++;
			} else if(number > numberScaner) {
				System.out.println("plans a number greater than");
				count++;
				}
			}
		}
	}
}
