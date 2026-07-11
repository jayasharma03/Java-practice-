import java.util.Scanner;


public class noIsPositiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number is positive Negative Or Zero...");
        System.out.println("please enter the number");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("positive");
        } else if (num < 0){
            System.out.println("Negative");
        } else {
            System.out.println("zero");
        }

        
    }
    
}
