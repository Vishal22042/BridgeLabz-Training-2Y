<<<<<<< HEAD
import java.util.Scanner;

public class Q9UniversityFeeDiscount {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){

        System.out.print("Enter fees : ");
        double fee = input.nextDouble();

        System.out.print("Enter discount percentage : ");
        double discountPercent = input.nextDouble();

        double discount = (fee * discountPercent) / 100;

        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);

        }
    }
}
=======
import java.util.Scanner;

public class Q9UniversityFeeDiscount {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){

        System.out.print("Enter fees : ");
        double fee = input.nextDouble();

        System.out.print("Enter discount percentage : ");
        double discountPercent = input.nextDouble();

        double discount = (fee * discountPercent) / 100;

        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);

        }
    }
}
>>>>>>> 42634efad4a176871506665b1f7bc29f97650b42
