import java.util.Scanner;


public class Logical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to ticket Discount Calculator");
        System.out.println("please enter your age");
        int age = sc.nextInt();
        System.out.println("Are you a female?(true/false)");
        boolean isfemale = sc.nextBoolean();


        if(age < 5){

            System.out.println("you got 75% discount");

        } else if (isfemale) {

            System.out.println("you got 50 discount");

        } else if(age > 60 && !isfemale){

            System.out.println("you got 25% discount");
        } else {

            System.out.println("you got no discount");

        }

    }
    
}
