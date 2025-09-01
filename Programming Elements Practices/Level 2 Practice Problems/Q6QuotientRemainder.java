<<<<<<< HEAD
import java.util.Scanner;

public class Q6QuotientRemainder {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){

        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder +
                           " of two number " + number1 + " and " + number2);

        }
    }
}
=======
import java.util.Scanner;

public class Q6QuotientRemainder {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){

        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder +
                           " of two number " + number1 + " and " + number2);

        }
    }
}
>>>>>>> 42634efad4a176871506665b1f7bc29f97650b42
