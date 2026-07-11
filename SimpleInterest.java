import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int R = sc.nextInt();
        int T = sc.nextInt();


        double Simpleinterest  = P*R*T/100;
        System.out.println(Simpleinterest);



    }
}
