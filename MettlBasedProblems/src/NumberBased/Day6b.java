package NumberBased;
import java.util.Scanner;
public class Day6b {
	public static void main(String args[])
	{
		int n,c=1;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
			c=c*i;
		System.out.println(c);
	}
}
