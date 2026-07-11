
import java.util.Scanner;

public class CInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();

        double amount = p * Math.pow(1 + (r / 100.0), t); //Math.pow power nikalne k liye use hota hai 
        double cInterest = amount - p;

        System.out.println(cInterest);

        sc.close();
    }
}