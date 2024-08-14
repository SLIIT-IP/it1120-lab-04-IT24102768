import java.util.Scanner;
public class IT24102768Lab4Q3
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		int num;
		String no;
		
		System.out.print("Enter a number: ");
		num=input.nextInt();
		
		no=(num>0)?"The number is: Positive":
		   (num<0)?"The number is: Negative":
		   "The number is Zero";

		System.out.println(no);
					
	}
}