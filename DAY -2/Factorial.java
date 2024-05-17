import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner user=new Scanner(System.in);
        System.out.println("Enter the number");
        int number = user.nextInt();
        int factorial = factorial(number);
        System.out.println("Factorial of " + number + " (Recursive): " + factorial);
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

