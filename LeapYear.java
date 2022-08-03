import java.util.*;
class LeapYear
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Year : ");
		int Year = sc.nextInt();
		if (Year%4==0)
		{
			System.out.println(Year+" is leap year");
		}
		else
		{
			System.out.println(Year+" is not leap year");
		}
	}
}