import java.util.Scanner;

class x_main12 {
    public static String dec_oct(long num) {
        int num1 = (int) num; // Cast long to int
        StringBuilder result = new StringBuilder();

        if (num1 == 0) {
            result.append(0); // Special case for input 0
        } else {
            while (num1 != 0) {
                result.insert(0, num1 % 8); // Insert remainder at the beginning
                num1 = num1 / 8;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter a decimal no:");
        long num = in1.nextLong();
        System.out.println(dec_oct(num));
    }
}
