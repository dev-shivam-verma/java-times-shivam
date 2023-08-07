import java.util.Scanner;

//Program to input a number from user and print its table
class x_main5 {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter the number: ");
        float num = in1.nextFloat();

        for(int i=1  ; i < 11 ; i++){
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}