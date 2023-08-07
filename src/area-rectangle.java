import java.util.Scanner;

//to input lenght and breadth of rectangle and print the area
class x_main9 {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter length: ");
        float lenght = in1.nextFloat();
        System.out.println("Enter breadth: ");
        float breadth = in1.nextFloat();

        //calculation of area
        float area = lenght * breadth;

        System.out.println("Area: "+ area);
        in1.close();
    }
}