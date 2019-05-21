import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        float radius = inp.nextFloat();
        double perimeter = 2.0 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Perimeter of circle is: " + perimeter);
        System.out.println("Area of circle is: " + area);
    }
}
