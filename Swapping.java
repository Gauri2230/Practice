import java.util.*;
class Swapping
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First number=");
		int num1=sc.nextInt();
		System.out.print("Enter Second number=");
		int num2=sc.nextInt();
		System.out.println("Number Before Swapping:"+num1+" "+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("Number After Swapping:"+num1+" "+num2);
	}
}