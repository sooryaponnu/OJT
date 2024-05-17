import java.util.Scanner;
public class Number {
    public static void main(String[]args){
        Scanner num=new Scanner(System.in);
        System.out.println("Enter the  first Intiger:");

        int a=num.nextInt();

        System.out.println("Enter the second Intiger:");

        int b=num.nextInt();

        if(a>b){
            System.out.println(" The greatest number is :" +a);
        }
        else if(b>a){
            System.out.println(" The greatest number is:" +b);
        }
        else{
            System.out.println("Both number are equal.");
        }
        num.close();
    }
}
