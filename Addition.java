package scanner_class;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args)
	{
Scanner s1 = new Scanner(System.in);
System.out.println("Enter value of a:");
int a = s1.nextInt();
System.out.println("Enter value of b:");
int b = s1.nextInt();
int sum = a+b;
System.out.println("Addition is:" +sum);
s1.close();
	}

}
