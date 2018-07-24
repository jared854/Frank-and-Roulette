public interface OnePlayerGame {
	
	public void makeAPlay(String play);
	
	
	public boolean validPlay(String validity);
	
	
	public boolean gameOver();

	
	public String gameStatus();


}
