package NumberBased;
import java.util.Scanner;
public class Day5a {
	public static void main(String args[])
	{
		int n,m;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		if(n%m==0)
			System.out.println("Excat multiple of " +m);
	}
}
