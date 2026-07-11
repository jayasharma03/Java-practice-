import java.util.Scanner;


public class GradeBasedOnMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Grade Based On Marks");
        System.out.println("Enter the Marks");
        int m = sc.nextInt();
        if(m >= 90){
            System.out.println("grade is A");

        } else if(m >= 75){

        System.out.println("grade is B");

        } else if ( m >= 60){
            System.out.println("grade is C");
        } else if (m >= 30){
            System.out.println("grade is D");
        } else {
            System.out.println("grade is E");
        }
        
        }
    
    
}
