import java.util.Scanner;
public class IT24102768Lab4Q2
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		int num1, num2, per1, per2;
		
		System.out.print("Please enter exam marks (out of 100): ");
		num1=input.nextInt();
		
		if(num1>100 || num1<=0)
		{
			System.out.println("Invalid input for exam marks. Terminating program.");
			
		}
		else


		System.out.print("Please enter lab submission marks (out of 100): ");
		num2=input.nextInt();

		if(num2>100 || num2<=0)
		{
			System.out.println("Invalid input for lab submission marks. Terminating program.");
		}
		else


		System.out.print("Please enter the percentage given for the exam: ");
		per1=input.nextInt();

		System.out.print("Please enter the percentage given for the lab submission: ");
		per2=input.nextInt();

		double no1=((num1*per1)/100.0)+((num2*per2)/100.0);
		
		if((per1+per2)>100)
		{
			System.out.println("The percentages must add up to 100. Terminating program.");
		}		
		else
		{
			System.out.println("Final Exam Marks is : "+ no1 );
		}
						
	}
}