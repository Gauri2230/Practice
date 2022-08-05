import java.util.*;
class FibonacciSeries
{
	public static void main(String args[])
	{
		int FirstTerm=0,SecondTerm=1,NextTerm;
		Scanner sc=new Scanner(System.in);
		System.out.print("Fibonacci Series till: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(FirstTerm + ", ");
			NextTerm=FirstTerm+SecondTerm;
			FirstTerm=SecondTerm;
			SecondTerm=NextTerm;
		}
	}
}