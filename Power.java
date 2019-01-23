import java.util.Scanner;

public class Power {
	
	public static void main(String[] args) {
		System.out.println("enter the number");
		int n,i,k;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int flag=0;
		for(i=1;i<=n;i++)
		{
			double p=Math.pow(10,i);
			if((int)p==n)
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
        }
		
		if(flag==1)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

}
