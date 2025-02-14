//How to initialize the value of each method under scanner class:
package scanner_class;

import java.util.Scanner;

public class Scanner_class_Program {

	public static void main(String[] args)
	{
Scanner s1 = new Scanner(System.in);
String s= s1.next();
int i = s1.nextInt();
double d = s1.nextDouble();
long l = s1.nextLong();
byte b = s1.nextByte();
float f = s1.nextFloat();
boolean b1 = s1.nextBoolean();
short s2 = s1.nextShort();
s1.close();
	}

}
