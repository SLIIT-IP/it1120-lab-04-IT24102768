import java.util.Scanner;
public class IT24102768Lab4Q1
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.print("Enter a number: ");
		num=input.nextInt();
		
		if(num<0)
		{
			System.out.println("The number is: Negative");
		}
		else if(num>0)
		{
			System.out.println("The number is: Positive");
		}
		else
		{
			System.out.println("The number is Zero");
		}
			
	}
}