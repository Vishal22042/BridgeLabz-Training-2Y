import java.util.Scanner; 
public class CylinderVolumeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        double height;
        double volume;
        System.out.print("Enter the radius of the cylinder: ");
        radius = input.nextDouble(); 
        System.out.print("Enter the height of the cylinder: ");
        height = input.nextDouble(); 
        volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("The volume of the cylinder is: " + volume + " cubic units");
        input.close();
    }
}
