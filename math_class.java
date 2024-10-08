import java.util.Scanner;
public class math_class {
    public static void main(String[] args){
        double x,y,z;

        Scanner sides = new Scanner(System.in);
        System.out.println("Enter the first side of the triangle:");
        x = sides.nextDouble();
        sides.nextLine();

        System.out.println("Enter the second side of the triangle: ");
        y = sides.nextDouble();
        sides.nextLine();

        z = Math.sqrt(Math.pow(x, 2) + Math.pow(y,2));
        System.out.println("The length of the third side of the triangle is: " + z);

        sides.close();
    }
}
