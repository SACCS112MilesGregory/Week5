import java.util.Scanner;

public class Week5Lab6
{

	public static void main(String[] args) 
	{
		int secretNumber;
		
		Scanner input = new Scanner(System.in);
		int guess;
		int count = 1;
		
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
			count++;
		} while (count < 4);
	}
}
