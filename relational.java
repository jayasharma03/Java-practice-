import java.util.Scanner;


public class relational {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to driving license portal");
        System.out.println("enter your age:");
        int age =  sc.nextInt();

        if (age >= 18){
            System.out.println("you are eligible ");
        } else {
            System.out.println("beta cycle chalao");
        }
    }
    
}
