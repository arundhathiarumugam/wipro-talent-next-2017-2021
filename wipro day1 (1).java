1.To print the number is positive or negative or zero:

public class number
{
    public static void main(String[] args) 
    {
        int number=109;
        if(number > 0)
        {
            System.out.println(number+" is a positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is a negative number");
        }
        else
        {
            System.out.println(number+" is a zero");
        }
    }
}
2.To accept the two number and find the greatest number:

import java.util.*;
 public class greaterofno {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int a = in.nextInt();  
		System.out.print("Input the second number: ");
		int b = in.nextInt(); 
		System.out.println("Result: "+result(a, b));
    }
	public static int result(int x, int y)
     {  
	if(x == y)
		return 0;
	    if(x % 6 == y % 6)
		    return (x < y) ? x : y;
	    return (x > y) ? x : y;
     }
}


3.To print even or odd:

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}

4.To print the number in backwards:

import java.util.Scanner;

public class backwardnumber {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int number;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Maximum integer Value : ");
		number = sc.nextInt();	
		
		backwardnumber(number);	
	}
	
	public static void backwardnumber(int num)
	{
		int i;
		
		for(i = num; i >= 0; i--)
		{
			System.out.print(i +" "); 
		}	
	}
}