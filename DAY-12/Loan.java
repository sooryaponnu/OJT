
import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age =sc.nextInt();
        
        System.out.println("Enter your anual income");
        int income =sc.nextInt();

        if(age<18){
            System.out.println("Not eligible for lon.");
        }
        else if( age>=18 && age <=25 && income>=2500)
        {
            System.out.println("eligible for small loan");
        }
        else if(age>35 && income>=75000)
        {
            System.out.println("eligible for large loan");
        }
        else{
            System.out.println("Note eligible for loan");
        }
    }
    
}
