package NumberBased;
import java.util.Scanner;
public class Day5b {
	public static void main(String args[])
	{
		int n,c=0;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			if(a[i]%2==0)
				c++;
		System.out.println(c);
	}
}
