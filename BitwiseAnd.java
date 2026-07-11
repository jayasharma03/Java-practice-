import java.util.Scanner;

public class BitwiseAnd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Showcasing Bitwise And operator");
        System.out.println("please enter first number");
        int  first = sc.nextInt();
        System.out.println("please enter second number");
        int second = sc.nextInt();

        int result = first & second;
        System.out.println("result is:" + result );
    }
    
}
