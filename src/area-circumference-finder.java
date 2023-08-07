import java.util.Scanner;
import java.lang.Math;

//program to take radius from user and print the area and perimeter of that circle
class x_main7 {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = in1.nextDouble();

        //formula for area and circumference
        double area = Math.PI * radius*radius;
        double circum = Math.PI * 2 * radius;

        System.out.println("area: " + area);
        System.out.println("circumference: " + circum);

        in1.close();

    }
}