package java;
import java.util.*;
class Grade{
	void grade(int marks){
		if(marks>=80)
			System.out.println("A+");
		else if(marks>=75 && marks<80)
			System.out.println("A");
		else if(marks>=70 && marks<75)
			System.out.println("A-");	
	}
}

public class My_Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		Grade g = new Grade();
		g.grade(number);
	}
}
