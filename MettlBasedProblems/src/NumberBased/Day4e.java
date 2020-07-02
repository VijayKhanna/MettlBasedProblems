package NumberBased;
import java.util.Scanner;
public class Day4e {
	public static void main(String args[])
	{
		int n1,n2;
		Scanner sc= new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		System.out.println((n1%10+n2%10));
	}
}
