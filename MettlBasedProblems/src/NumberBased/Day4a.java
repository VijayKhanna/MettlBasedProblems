package NumberBased;
import java.util.Scanner;
public class Day4a {
public static void main(String args[])
{
	int n;
	Scanner sc= new Scanner(System.in);
	n=sc.nextInt();
	if(n%2==0)
		System.out.println("Even");
	else
		System.out.println("Not Even");
}
}
