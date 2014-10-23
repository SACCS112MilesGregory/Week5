import java.util.Scanner;
import java.util.Random;

public class Homework 
{

	public static void main(String[] args) 
	{
		String myPlay;
		String computerPlay = null;
		int randomPlay;
		int count=1;
		
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		System.out.println("It's the Rock, Paper, Scissors game!");
		System.out.println("Rock = R, Paper = P, and Scissors = S");
		
		do
		{
			randomPlay = generator.nextInt(3)+1;
		
			if(randomPlay == 1)
				computerPlay = "R";
			else if(randomPlay == 2)
				computerPlay = "P";
			else if(randomPlay == 3)
				computerPlay = "S";
		
			System.out.println("\nEnter your play: ");
			
			myPlay = scan.next();
			myPlay = myPlay.toUpperCase();
		
			System.out.println("The computer chose: " + computerPlay);
		
			if(myPlay.equals(computerPlay))
			{
				System.out.println("Its a tie!");
			}
			else if(myPlay.equals("R"))
			{
				if(computerPlay.equals("S"))
					System.out.println("Rock crushes scissors. You win!!");
			else if(computerPlay.equals("P"))
				System.out.println("Paper eats rock. You lose!!");
			}
			else if(myPlay.equals("P"))
			{
				if(computerPlay.equals("S"))
					System.out.println("Scissors cuts paper. You lose!!");
				else if(computerPlay.equals("R"))
				System.out.println("Paper eats rock. You win!!");
			}
			else if(myPlay.equals("S"))
			{
				if(computerPlay.equals("P"))
					System.out.println("Scissors cut paper. You win!!");
				else if(computerPlay.equals("R"))
					System.out.println("Rock breaks scissors. You lose!!");
			}
			else
				System.out.println("Invalid input.");
			count++;
		}
		while(count<4);
	}
}
