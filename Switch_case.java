package scanner_class;

import java.util.Scanner;

public class Switch_case 
{
	public static void main(String[] args)
	{
Scanner s = new Scanner(System.in);
System.out.println("Press 1 for Chrome");
System.out.println("Press 2 for Firefox");
System.out.println("Press 3 for Edge");
int browser_selection = s.nextInt();
switch(browser_selection)
{
case 1: System.out.println("Launch Chrome browser");
break;
case 2: System.out.println("Launch Firefox browser");
break;
case 3: System.out.println("Launch Edge browser");
break;
default: System.out.println("Sorry your selection is wrong");
s.close();
}
	}

}
