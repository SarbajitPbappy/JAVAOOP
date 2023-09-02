package java;
import java.util.Scanner;
import java.util.*;
public class Mains {
    public static int sumOf (int a,int b){
        return a+b;
    }
    public static int productOf (int a,int b){
        return a*b;
    }
    public static float divOf (int a,int b){
        return (float) a/b;
    }
    public static int subOf (int a,int b){
        return Math.abs(a-b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	while(true){
        System.out.print("Enter the first number=>");
        int a = sc.nextInt();
        System.out.print("Enter the second number=>");
        int b = sc.nextInt();
        System.out.println("Enter the operation you want to perform=>");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
	System.out.println("5. Exit");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("The sum of "+a+" and "+b+" is "+sumOf(a,b));
                break;
            case 2:
                System.out.println("The difference of "+a+" and "+b+" is "+subOf(a,b));
                break;
            case 3:
                System.out.println("The product of "+a+" and "+b+" is "+productOf(a,b));
                break;
            case 4:
                System.out.println("The division of "+a+" and "+b+" is "+divOf(a,b));
                break;
	    case 5:
		System.out.println("Exiting......");
		return;
            default:
                System.out.println("Invalid choice");
        }
      }
    }
}
