import java.lang.StringBuilder;
import java.util.Scanner;

class x_main11 {

    //method to print binary sum
    public static String binary_sum(long a, long b){
        String a1 = String.valueOf(a), b1  = String.valueOf(b); // converting the numbers to string
        int i = a1.length() -1 , j = b1.length() -1;// storing their length

        // initiating a string builder to store result
        StringBuilder result = new StringBuilder();

        //initiating sum and carry
        int sum = 0, carry = 0;

        // main logic
        while (i >= 0 || j >= 0 || carry != 0){
            if(j >= 0)
                sum += b1.charAt(j) - '0';
            if(i >= 0)
                sum += a1.charAt(i) - '0';

            if(sum+carry == 0){
                sum = 0;
                result.append(0);
            }
            else if(sum+carry == 1){
                result.append(1);
                sum = 0;
                carry = 0;
            } else if (sum + carry == 2) {
                result.append(0);
                carry = 1;
                sum = 0;
            } else {
                result.append(1);
                carry = 1;
                sum = 0;
            }
            j--;
            i--;
        }

        return result.reverse().toString();

    }

    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter the first no:");
        long num1 = in1.nextLong();

        System.out.println("Enter the second no:");
        long num2 = in1.nextLong();
        System.out.println(binary_sum(num2,num1));
    }


}