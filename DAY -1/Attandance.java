import java.util.Scanner;
public class Attandance {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number of days of class:");
            double totalDays = s.nextDouble();
            System.out.println("Enter the number of days attended:");
            double attendedDays = s.nextDouble();
            double attendancePercentage = (attendedDays / totalDays) * 100;
            if (attendancePercentage >= 75) {
                System.out.println("You are eligible for the exam.");
            } else {
                System.out.println("You are not eligible.");
            }

            s.close();
        }
}
