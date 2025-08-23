import java.util.Scanner;
public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double principal;
        double rate;
        double time;
        double simpleInterest;
        System.out.print("Enter the Principal amount: ");
        principal = input.nextDouble(); 
        System.out.print("Enter the Annual Rate of Interest (in %): ");
        rate = input.nextDouble(); 
        System.out.print("Enter the Time period (in years): ");
        time = input.nextDouble(); 
        simpleInterest = (principal * rate * time) / 100;
        System.out.println("The Simple Interest is: " + simpleInterest);
        input.close();
    }
}
