<<<<<<< HEAD
import java.util.Scanner;

public class Q16Handshakes {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){

        System.out.print("Enter the number of students: ");
        int Students = input.nextInt();

        int Handshakes = (Students * (Students - 1)) / 2;

        System.out.println("The maximum number of possible handshakes is " + Handshakes);

        }
    }
=======
import java.util.Scanner;

public class Q16Handshakes {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){

        System.out.print("Enter the number of students: ");
        int Students = input.nextInt();

        int Handshakes = (Students * (Students - 1)) / 2;

        System.out.println("The maximum number of possible handshakes is " + Handshakes);

        }
    }
>>>>>>> 42634efad4a176871506665b1f7bc29f97650b42
}