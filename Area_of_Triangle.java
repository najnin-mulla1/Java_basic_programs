//WAP on Area_of_Triangle
package scanner_class;

import java.util.Scanner;

public class Area_of_Triangle
{
public static void main(String[] args)
{
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter value of b:");
	int b = s1.nextInt();
	System.out.println("Enter value of h:");
	int h = s1.nextInt();
	
	double area = (b*h)/2;

	System.out.println("Area_of_Triangle is:" +area);
	s1.close();

}
}
