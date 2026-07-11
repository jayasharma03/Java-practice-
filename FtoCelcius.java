import java.util.Scanner;

public class FtoCelcius {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        double f = sc.nextDouble();

        double celcius = (f-32) * 5/9;
        System.out.println(celcius);


    }
}
