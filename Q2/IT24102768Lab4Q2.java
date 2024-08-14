import java.util.Scanner;
public class IT24102768Lab4Q2
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		int num1, num2, num3, num4;
		
		System.out.print("Please enter exam marks (out of 100): ");
		num1=input.nextInt();
		
		switch(num1)
		{
		case(num1>100 || num1<=0): System.out.println("Invalid input for exam marks. Terminating program.");
		break;
		}
		if(num1>100 || num1<=0)
		{
			System.out.println("Invalid input for exam marks. Terminating program.");
			
		}

		System.out.print("Please enter lab submission marks (out of 100): ");
		num2=input.nextInt();

		if(num2>100 || num2<=0)
		{
			System.out.println("Invalid input for lab submission marks. Terminating program.");
		}

		System.out.print("Please enter the percentage given for the exam: ");
		num3=input.nextInt();

		System.out.print("Please enter the percentage given for the lab submission: ");
		num4=input.nextInt();

		if((num3+num4)>100)
		{
			System.out.println("The percentages must add up to 100. Terminating program.");
		}		
		
							
	}
}