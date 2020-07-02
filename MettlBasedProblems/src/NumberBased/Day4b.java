package NumberBased;

import java.util.Scanner;

public class Day4b {
	public static void main(String args[])
	{
		int n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		if(n%2!=0)
			System.out.println("Odd");
		else
			System.out.println("Not Odd");
	}
}
