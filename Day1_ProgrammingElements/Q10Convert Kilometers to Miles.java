import java.util.Scanner;
public class KilometerToMilesConverter {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilometers;
        double miles;
        final double CONVERSION_FACTOR = 0.621371; 

        System.out.print("Enter the distance in kilometers: ");
        kilometers = input.nextDouble();
        miles = kilometers * CONVERSION_FACTOR;
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");

        input.close();
    }
}
