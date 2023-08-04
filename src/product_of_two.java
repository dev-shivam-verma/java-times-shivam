import java.util.Scanner;

class x_main3 {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter 1st no: ");
        float num1 = in1.nextFloat();
        System.out.println("Enter 2nd no: ");
        float num2 = in1.nextFloat();

        System.out.println("The product is: "+ (num1*num2));
    }
}