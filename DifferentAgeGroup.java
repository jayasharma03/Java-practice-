import  java.util.Scanner;

public class DifferentAgeGroup {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Different Age Group");
    System.out.println("enter the age ");
    int age = sc.nextInt();
    

    if (age <= 13){
        System.out.println("child");

    } else if (age <= 20){
        System.out.println("teen");
    } else if(age <= 60){
        System.out.println("Adult");
    } else {
        System.out.println("Senior citizen");
    }
    

    }
    
}
