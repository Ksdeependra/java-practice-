import java.util.Scanner;
public class Strongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		int p,q,i,r,n;
		int sum=0;
		System.out.println("enter a new number:");
		num=sc.nextInt();
		n=num;
		while(num!=0)
		{
			i=1;
			p=1;
			r=num%10;
			while(i<=r)
			{
				p=p*i;
				i++;
			}
		sum=sum+p;
		num=num/10;
		}
		if(sum==n)
		{
			System.out.println(n+" is a strong number");
		}
		else
			System.out.println(n+" is a not a strong number");
			
			

	}

}
