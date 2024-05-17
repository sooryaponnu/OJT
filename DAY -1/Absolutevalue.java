import java.util.Scanner;
public class Absolutevalue {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num =x.nextInt();
        int absoluteValue=Math.abs(num);
        System.out.println("The Absolute Value is: " + absoluteValue);
        x.close();
    }
}
