
public class Roulette implements OnePlayerGame {
	
	private int bet = 0;
	private int earnings = 0;
	private int spin = 0;
	private int min = 0;
	private int max = 36;
	private String gameOver;
	
	public Roulette(int i) {
		i = bet;
		if (bet == spin){
			earnings = bet * 35;
		}
		else{
			earnings = 0;
		}
	}


	@Override
	public void makeAPlay(String newChoice) {
		if (validPlay(newChoice)){
			spin = (int) Math.random() * (max - min) + min;
			if (spin == bet){
				earnings = bet * 35;
			}
		}
	}
	

	@Override
	public boolean validPlay(String validity) {
		boolean check = true;
		int[] roulette = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36};
		for (int i = 0; i < roulette.length; i++){
			if (bet != roulette[i]){
				check = false;
			}
		}
		return check;
	}

	@Override
	public boolean gameOver() {
		if (gameOver == "cash out"){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public String gameStatus() {
		return ("Bets: " + bet + ", Earnings: " + earnings);
	}

}
