//WAP on Area_of_Circle
package scanner_class;

import java.util.Scanner;

public class Area_of_Circle
{
final static double pi = 3.14;
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
System.out.println("Enter the value of r:");
int r = s1.nextInt();
double area = pi*r*r;
System.out.println("Area_of_Circle is:" +area);
s1.close();

	}

}
