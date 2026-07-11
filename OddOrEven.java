import java.util.Scanner;


public class OddOrEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("check whether the given number are Even or Odd");
        System.out.println("Enter  the number please");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("numer is Even");
        } else
        System.out.println("number is Odd");

    }
    
}
