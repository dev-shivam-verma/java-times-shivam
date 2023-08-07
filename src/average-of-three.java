import java.util.Scanner;

//To take three numbers from user and print their average
class x_main8 {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter 1st no:");
        float num1 = in1.nextFloat();
        System.out.println("Enter 2nd no:");
        float num2 = in1.nextFloat();
        System.out.println("Enter 3rd no:");
        float num3 = in1.nextFloat();

        //calculation of average
        float average = (num1 + num2 + num3)/ 3 ;

        System.out.println("The average is: " + average);
        in1.close();
    }
}