import java.util.Scanner;
public class rectangle {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length :");
        int x=s.nextInt();
        System.out.println("Enter the bridth :");
        int y=s.nextInt();
        if(x==y){
            System.out.println("Square");
        }
        else{
            System.out.println("rectangle");

        }
    }
}
