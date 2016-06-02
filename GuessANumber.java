package week9;
import javax.swing.JOptionPane;

public class GuessANumber {
	public static void main(String[] args){
		int round = 1;
		
		do{
			RandomNumber i = new RandomNumber();
			int CompNumber = i.GetANumber_Between_1_and_10();
			
			String UserGuess = JOptionPane.showInputDialog("\nIm thinking of a number between 1 and 10." + "\nWhat is it");
			
			int UserGuessInt = Integer.parseInt(UserGuess);
			
			if (UserGuessInt == CompNumber)
			{
				String Equal = String.format("Your guess is correct! My number is %d.", CompNumber);
				JOptionPane.showMessageDialog(null, Equal);
			}
			else{
				String big = String.format("Your guess is too big. My number is %d.", CompNumber);
				String small = String.format("Your guess is too smal. My number is %d.", CompNumber);
				JOptionPane.showMessageDialog(null, (UserGuessInt > CompNumber)? big:small);
			}
			round++;
		}
		while (round < 4);
	}

}
