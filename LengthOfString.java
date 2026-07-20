import java.util.Scanner;
public class LengthOfString{
    public static void main(String[] argd){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter lenth of string");
        String s = sc.nextLine();
        System.out.println("length of string" + s.length());
    }
}