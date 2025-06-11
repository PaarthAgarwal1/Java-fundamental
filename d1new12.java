import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base in inches: ");
        float base = sc.nextFloat();
        System.out.print("Enter height in inches: ");
        float height = sc.nextFloat();

        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516;

        System.out.println("Area of the triangle is " + areaInInches + " square inches and " + areaInCm + " square cm.");
    }
}
