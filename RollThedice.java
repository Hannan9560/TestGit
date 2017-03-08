package Basic;

import java.security.SecureRandom;
import java.util.Scanner;

public class RollThedice {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int dice_1, dice_2, score = 0, sum = 0, i=1, one, two;
		boolean r;
		SecureRandom randomNumber = new SecureRandom();
		
		System.out.println("Welcome to Roll the dice game....");
		System.out.println("Roll the dice");
		while(i <= 10)
		{
			dice_1 = 1 + randomNumber.nextInt(6);
			dice_2 = 1 + randomNumber.nextInt(6);
			one = input.nextInt();
			System.out.println("The rolling dice is: "+dice_1+ "  " + dice_2);
			if(((dice_1 + dice_2) == 7) || ((dice_1 + dice_2) == 11) )
			{
				System.out.println("Win.........:):)");
			}
			else if(((dice_1 + dice_2) == 2) || ((dice_1 + dice_2) == 3) || ((dice_1 + dice_2) == 12))
			{
				System.out.println("You are lost..... :(:(");
			}
			else if(((dice_1 + dice_2) == 4) || ((dice_1 + dice_2) == 5) || ((dice_1 + dice_2) == 6) || ((dice_1 + dice_2) == 8) || ((dice_1 + dice_2) == 9) || ((dice_1 + dice_2) == 10))
			{
				sum = (dice_1 + dice_2);
				//System.out.println(sum);
				if(sum == (dice_1 + dice_2))
				{
					System.out.println("Sum Match......... :):)");
				}
				else if((dice_1 + dice_2) == 7)
				{
					System.out.println("You are lost..... :(:(");
				}
			}
			i++;
		}
		
	}
}
