import java.util.Scanner;
class Palindrome
{
	public static void checkPalindrome(int num)
	{
		int copy=num;
		int ans=0;
		while(num!=0)
		{
			int rem=num%10;
			ans=ans*10+rem;
			num=num/10;
		}
		if(ans==copy)
			System.out.println(copy+" is Palindrome");
		else
			System.out.println(copy+" is not Palindrome");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to check is it Palindrome or not");
		int num=sc.nextInt();
		checkPalindrome(num);
	}
}