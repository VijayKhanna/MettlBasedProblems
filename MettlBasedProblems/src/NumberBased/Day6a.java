package NumberBased;
import java.util.Scanner;
public class Day6a {
	public static void main(String args[])
	{
		int n,c=0;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		for(int i=2;i<=n/2;i++)
			if(n%i==0)
				c++;
			else
				c=0;
		if(c>0)
			System.out.println("Not a prime");
		else
			System.out.println("Prime");
	}
}
