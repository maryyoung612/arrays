import java.util.Scanner;
public class array
	{
		public static void main(String[] args)
			{
			//sweets input challenge
			Scanner userInput = new Scanner(System.in);
			System.out.println("How many favorite sweets do you have?");
			int numOf = userInput.nextInt();
			String candies[]= new String [numOf];
			Scanner cool = new Scanner(System.in);
			for(int i=0; i<candies.length; i++)
				{
				System.out.println("Please unput the sweets.");
				candies[i] = cool.nextLine();
				}
			
			for(String fred:candies)
				{
				System.out.println(fred);	
				}
			System.out.println();
			//number input challenge
			System.out.println("Think of 8 numbers & input them");
			int numbs[] = new int[8];
			Scanner pie = new Scanner(System.in);
			for(int i=0; i<numbs.length;i++)
				{
				System.out.println("Input a number");
				numbs[i] =pie.nextInt();
				}
			int addE=0;
			int addO=0;
			for(int tom:numbs)
				{
				if(tom%2==0)
					{
					addE+=tom;
					//addE=addE+tom;
					}
				else
					{
					addO+=tom;
					//addO=addO+tom;
					}
				}
			System.out.println("The even numbers add up to " +addE);
			System.out.println("The odd numbers add up to "+addO);
			System.out.println();
			//random digit challenge
			System.out.println("I will generate a series of numbers");
			Scanner newScan= new Scanner(System.in);
			int coolTwo[] = new int[5];
			System.out.println("Here is the numbers in reverse order");
			for(int i=coolTwo.length-1;i>=0;i--)
				{
				int nums = (int)(Math.random()*90)+10;
				System.out.println(nums);
				coolTwo[i]=nums;
				}
			System.out.println();
			System.out.println("Here is the numbers printed out in normal order");
			for(int jack:coolTwo)
				{
				System.out.println(jack);
				}
			System.out.println();
			//number stripper
			System.out.println("Please input a 4 digit number and I will insert them into an array backwards");
			Scanner stuff= new Scanner(System.in);
			int number= stuff.nextInt();
			int backwards[] = new int[4];
			int sec = 1;
			System.out.println("Here is the numbers in reverse order");
			for(int i =backwards.length-1;i>=0;i--)
				{
				sec=number%10;
				backwards[i]=sec;
				System.out.println(sec);
				number = number/10;
				}
			}
	}