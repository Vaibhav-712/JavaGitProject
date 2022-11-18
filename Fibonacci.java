import java.util.Scanner;
class Fibonacci
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range:");
		int num=sc.nextInt();
		int n1=0,n2=1,sum=0;
		System.out.println("\n"+n1);
		for(int i=0;i<num-1;i++)
		{	sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
		}
		
	}
}
			
			