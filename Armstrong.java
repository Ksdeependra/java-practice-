import java.util.concurrent.SynchronousQueue;

public class Armstrong {

	public static void main(String[] args) {
		int i,p,q,sum=0;
		System.out.println("Armstron numbers from 1 to 1000 are:");
		for(i=1;i<=1000;i++)
		{
			p=i;
			while(p>0)
			{
				q=p%10;
				sum=sum+(q*q*q);
				p=p/10;
			}
		if(sum==i)
		{
			System.out.println(i+"");
		}
		sum=0;
		
		}
		
		
	}

}
