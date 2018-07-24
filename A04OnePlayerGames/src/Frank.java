public class Frank implements OnePlayerGame {
	
	private String target;
	private int numGuesses;
	private int numMatching;
	
	public Frank(String newTarget){
		target = newTarget;
		if (target.length() !=5){
			numMatching = 5;
		}
		else if(!validPlay(target)){
			numMatching = 5;
		}
		else{
			numMatching = 0;
		}
	}
		
	
	public void makeAPlay(String newPlay){
		numMatching = 0;
		if (validPlay(newPlay)){
			for (int i = 0; i < target.length()-1; i++){
				if (target.substring(i, i+1).equals(newPlay.substring(i, i+1))){
					numMatching++;
				}
			}
			if(target.substring(target.length()-1).equals(newPlay.substring(target.length()-1)))
				numMatching++;
		}
	}
	
	public boolean validPlay(String validity){
		boolean valid = true;
		if(validity.length()==5){
			for (int i = 0; i < 5; i++){
				if(!Character.isLetter(validity.charAt(i))){
					valid = false;
				}
			}
			for (int j = 0; j < 5; j++){
				if(!Character.isLowerCase(validity.charAt(j))){
					valid = false;	
				}
			}
		}
		else{
			valid = true;
		}
		return valid;
	}
	
	
	public boolean gameOver(){
		if (numMatching == 5){
			return true;
		}
		else{
			return false;
		}
	}

	
	public String gameStatus(){
		return ("Guesses: " + numGuesses + ", Matches: " + numMatching);
	}

}
