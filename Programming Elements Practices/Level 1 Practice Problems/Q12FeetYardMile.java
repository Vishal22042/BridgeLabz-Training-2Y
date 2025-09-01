<<<<<<< HEAD
import java.util.Scanner;

public class Q12FeetYardMile {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){

        System.out.print("Enter the distance in feet: ");
        double Feet = input.nextDouble();

        double Yards = Feet / 3;

        double Miles = Yards / 1760;

        System.out.printf("The distance in feet is %.2f, in yards is %.2f, and in miles is %.6f%n",
                Feet, Yards, Miles);

        }
    }
}
=======
import java.util.Scanner;

public class Q12FeetYardMile {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){

        System.out.print("Enter the distance in feet: ");
        double Feet = input.nextDouble();

        double Yards = Feet / 3;

        double Miles = Yards / 1760;

        System.out.printf("The distance in feet is %.2f, in yards is %.2f, and in miles is %.6f%n",
                Feet, Yards, Miles);

        }
    }
}
>>>>>>> 42634efad4a176871506665b1f7bc29f97650b42
