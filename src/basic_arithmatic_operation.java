import java.util.Scanner;
//four basic arithmetic operations are performed on two numbers given by user
class x_main4{
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in); //Scanner handle defined
        System.out.println("Enter 1st no: ");
        float num1 = in1.nextFloat(); //We are using float to input a wide range of numbers
        System.out.println("Enter 2nd no: ");
        float num2 = in1.nextFloat();

        System.out.println("multiplication "+ num1 +" * "+num2 + " = "+ (num1 * num2));
        System.out.println("division "+ num1 +" / "+num2 + " = "+ (num1 / num2));
        System.out.println("addition "+ num1 +" + "+num2 + " = "+ (num1 + num2));
        System.out.println("subtraction "+ num1 +" - "+num2 + " = "+ (num1 - num2));

    }
}