import java.util.Scanner;

class x_main1{
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter 1st no: ");
        int num1 = in1.nextInt();
        System.out.println("Enter 2nd no: ");
        int num2 = in1.nextInt();

        System.out.println("The sum is: "+ (num2+num1));
    }
}