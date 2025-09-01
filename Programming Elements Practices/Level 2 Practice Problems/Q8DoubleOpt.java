<<<<<<< HEAD
import java.util.Scanner;

public class Q8DoubleOpt {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){

        System.out.print("Enter value for a: ");
        double a = input.nextDouble();

        System.out.print("Enter value for b: ");
        double b = input.nextDouble();

        System.out.print("Enter value for c: ");
        double c = input.nextDouble();

        double do1 = a + b * c;     
        double do2 = a * b + c;     
        double do3 = c + a / b;     
        double do4 = a % b + c;     

        System.out.println("The results of Double Operations are " + do1 + ", " + do2 + ", " + do3 + ", and " + do4);

        }
    }
=======
import java.util.Scanner;

public class Q8DoubleOpt {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){

        System.out.print("Enter value for a: ");
        double a = input.nextDouble();

        System.out.print("Enter value for b: ");
        double b = input.nextDouble();

        System.out.print("Enter value for c: ");
        double c = input.nextDouble();

        double do1 = a + b * c;     
        double do2 = a * b + c;     
        double do3 = c + a / b;     
        double do4 = a % b + c;     

        System.out.println("The results of Double Operations are " + do1 + ", " + do2 + ", " + do3 + ", and " + do4);

        }
    }
>>>>>>> 42634efad4a176871506665b1f7bc29f97650b42
}