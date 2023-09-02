import java.util.Scanner;
public class Add {
    public int sum(int x,int y){
        return x+y;
    }
    public double sum (double a, double b){
        return a+b;
    }
}
class Sub extends Add{
    public int sum(int w,int z){
        return w-z;
    }
    
    public static void main(String[] args) {
        Sub a= new Sub();
        // Scanner s= new Scanner(System.in);
        // int x= s.nextInt();
        // int y= s.nextInt();
        System.out.println("Sum Of Two Number is "+ super.sum(5,6));
        System.out.println("Sum Of Two Number is "+ a.sum(5.6,6.5));
    }
} 