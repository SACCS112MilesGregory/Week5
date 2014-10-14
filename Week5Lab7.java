import java.util.Scanner;

public class Week5Lab7
{

	public static void main(String[] args) 
	{
		int secretNumber;
		
		Scanner input = new Scanner(System.in);
		int guess;
		int answer;
		
		do
			{
			secretNumber = (int)(Math.random() * 999 + 1);
			System.out.print("Guess a number: ");
			guess = input.nextInt();
		
			System.out.printf("Your guess is %d.\n", guess);
		
			System.out.printf("The secret number is %d.\n", secretNumber);
		
			if((guess > secretNumber) && (guess > secretNumber + 10))
				System.out.println("Your guess is more than 10 too big!");

			else 
				if((guess < secretNumber) || (guess == secretNumber))
					System.out.println("Your guess is less than or equal to the secret number!");
				else
					System.out.println("Your guess is correct!");
			System.out.print("Would you like to play again? Please enter 1 for Yes or 2 for No: ");
			answer = input.nextInt();
		} while (answer == 1);
	}
}
