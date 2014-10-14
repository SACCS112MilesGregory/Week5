import java.util.Scanner;

public class Week5Lab2 
{

	public static void main(String[] args) 
	{
		int secretNumber;
		secretNumber = (int)(Math.random() * 999 + 1);
		
		Scanner input = new Scanner(System.in);
		int guess;
		
		System.out.print("Guess a number: ");
		guess = input.nextInt();
		
		System.out.printf("Your guess is %d.\n", guess);
		
		System.out.printf("The secret number is %d.\n", secretNumber);
		
		if(guess > secretNumber)
			System.out.println("Your guess is too big!");
		else
			System.out.println("Your guess is too small!");
	}
}
