import java.util.Scanner;


public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d= sc.nextInt();

        int perimeter = a+b+c+d;

        System.out.println(perimeter);
    }
    
}
