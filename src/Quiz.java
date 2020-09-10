/*
 This code was written 2 yrs ago so may be crazy
 Last edited 200910
 */
import java.util.Scanner;
public class Quiz
{
	public static void main(String []args)
	{
int c = 0;
		Scanner scan = new Scanner ( System.in );

		System.out.println("What's 2 + 2");

		String in;
		in = scan.nextLine();


		if(in.equals("4"))
		{
			System.out.println("Correct\n");
			c++;
		}

		else
		{
			System.out.println("Wrong\n");
		}

		System.out.println("What Language Is This Coded In?\n");

		System.out.println("C");
		System.out.println("C++");
		System.out.println("Java");
		System.out.println("PC");

		in=scan.nextLine();

		if(in.equalsIgnoreCase("Java"))
				{
					System.out.println("Correct");
					c++;
				}

				else
				{
					System.out.println("Wrong");
				}

				System.out.println(c + " Correct out of 2");

				System.out.println(100 * c/2 + "%");

	}
}