package smcs.swing.model;

public class NumberGuesser {

	private int number, lastGuess;
	private boolean haveGuessed;

	/**
	 * generates a random number within a range
	 * 
	 * @precondition high > low
	 * @param low
	 * @param high
	 */
	public NumberGuesser(int low, int high) {
		assert (high > low);
		number = (int) (Math.random() * (high - low) + low);
		haveGuessed = false;
	}

	/**
	 * receives guess about that number and responds with "hotter" or "colder"
	 */
	public String guess(int guess) {
		String response = "uh oh";
		
		if (!haveGuessed) {
			haveGuessed = true;
			response = (guess == number ? "right" : "wrong");
		} else {
			if (guess == number) {
				response = "right";
			} else {
				if (Math.abs(number - guess) < Math.abs(number - lastGuess)) {
					response =  "hotter";
				} else if (Math.abs(number - guess) > Math.abs(number - lastGuess)) {
					response = "colder";
				} else {
					response = "same";
				}
			}
		}
		
		lastGuess = guess;
		return response;
	}
}
