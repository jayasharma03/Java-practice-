
import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        System.out.println("welcome to swapping station");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        int c = a;
        a = b;
        b = c;
        
        System.out.println("swapping done....");
        System.out.println("value of A is:" + a);
        System.out.println("value of B is:" + b); 



        
    }
    
}
