import java.util.Scanner;

class x_main2 {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter the dividend: ");
        float dividend = in1.nextFloat();
        System.out.println("Enter the divisor: ");
        float divisor = in1.nextFloat();

        System.out.println("The quotient is: "+ (dividend/divisor));

        in1.close();
    }
}