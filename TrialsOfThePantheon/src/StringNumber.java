public class StringNumber {

	/* The StringNumber class converts a given string into a corresponding number sequence 
	 * based on the telephone keypad layout.It replaces each letter in the input string 
	 * with its corresponding digit based on the keypad. This class was made so that the question for
	 * the player when the intersected with NPC3 has to convert the String "Pasiphae" (the wife of King Minos)
	 * into number form - all the calculations for the number can be done here instead of inside the class.
	 * In case I want to build on the game and add more questions similar to converting String answers in number form 
	 * I wouldn't have to redo the code each time instead I can just modify this code (which is much more efficient).
	 * 
	 * Answer/Output Result: 72747423 
	*/

	private String input, newInput;

	// CONSTRUCTOR
	public StringNumber()
	{
		//Initializes the input string and newInput string.
		input = "Pasiphae"; 
		newInput = ""; 
	} 

	/* This method retrieves the converted number sequence by converting each letter in the input string 
	 * to its corresponding digit based on the telephone keypad layout. Returns the resulting number sequence 
	 * (stored in newInput) as a string.
	 */
	public String getNewOutput()
	{
		for (int i = 0; i < input.length(); i++) 
		{
			char currentChar = input.charAt(i);

	        // Convert letters to their corresponding digit based on the telephone keypad layout
			if (Character.isLetter(currentChar)) 
			{
				char upperChar = Character.toUpperCase(currentChar);
				if (upperChar == 'A' || upperChar == 'B' || upperChar == 'C') 
				{
					newInput += '2';
				}
				else if (upperChar == 'D' || upperChar == 'E' || upperChar == 'F') 
				{
					newInput += '3';
				}
				else if (upperChar == 'G' || upperChar == 'H' || upperChar == 'I') 
				{
					newInput += '4';
				}
				else if (upperChar == 'J' || upperChar == 'K' || upperChar == 'L') 
				{
					newInput += '5';
				}
				else if (upperChar == 'M' || upperChar == 'N' || upperChar == 'O') 
				{
					newInput += '6';
				}
				else if (upperChar == 'P' || upperChar == 'Q' || upperChar == 'R' || upperChar == 'S') 
				{
					newInput += '7';
				}
				else if (upperChar == 'T' || upperChar == 'U' || upperChar == 'V') 
				{
					newInput += '8';
				}
				else if (upperChar == 'W' || upperChar == 'X' || upperChar == 'Y' || upperChar == 'Z') 
				{
					newInput += '9';
				}
			}
		}

		return newInput;
	}

}