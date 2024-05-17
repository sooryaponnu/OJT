import java.util.Scanner;
public class BonusAmount {
    public static void main (String[] args){
        Scanner nowsalary =new Scanner(System.in);

        System.out.println("Enter your salary:");

        double x= nowsalary.nextDouble();

        System.out.println("Enter your Experience");

        double y= nowsalary.nextDouble();

        double z=x*(5.0/100);

        double total=x+z;

        if(y>5){
            System.out.println("Total salary:"+total);
        }
        else{
            System.out.println("Your salary:"+x);;
        }
        nowsalary.close();
    }
}
