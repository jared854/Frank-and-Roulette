import java.util.Scanner;

public class Play {

	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("What do you want to play? ");
		String answer = in.nextLine();
		if (answer.equals("frank")){
			System.out.println("What is the target? ");
			String target = in.nextLine();
			Frank mainFrank = new Frank(target);
			for (int i = 0; i < 100; i++){
				System.out.println("");
			}
			runGame(mainFrank);
		}
		else if(answer.equals("roulette")){
			System.out.println("What is your bet? (0-36): ");
			int choice = in.nextInt();
			Roulette mainRoulette = new Roulette(choice);
			runGame(mainRoulette);
		}
		
//		testFrank();
//		testRoulette();
	}
	
	public static void testFrank(){
		Frank firstFrank = new Frank("snakes");
		runGame(firstFrank);
		Frank secondFrank = new Frank("horse");
		runGame(secondFrank);
		Frank thirdFrank = new Frank("pUPPy");
		runGame(thirdFrank);
	}
	
	public static void testRoulette(){
		Roulette one = new Roulette(4);
		runGame(one);
		Roulette two = new Roulette(4);
		runGame(two);
		Roulette three = new Roulette(4);
		runGame(three);
		
	}
	
	public static void runGame(OnePlayerGame newGame){
		while (newGame.gameOver() == false){
			System.out.println(newGame.gameStatus());
			System.out.println("What is your guess?: ");
			String guess = in.nextLine();
			newGame.makeAPlay(guess);
		}
		System.out.println("GAME OVER");
		System.out.println(newGame.gameStatus());
		System.out.println("-----------------");
	}
}