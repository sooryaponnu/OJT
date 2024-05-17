import java.util.Scanner;
public class discount {
    public static void main (String[] args){
        Scanner dis =new Scanner(System.in);
        System.out.println("Enter the amount:");
        double x= dis.nextDouble();
        double y=x*(10.0/100);
        double z=x-y;
        if(x>1000){
            System.out.println("you get  total discount of:"+z);
        }
        else{
            System.out.println("no discount");
        }


    }
}
