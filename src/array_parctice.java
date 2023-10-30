import java.util.Scanner;

class array_question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of names you want to add: ");
        int size = sc.nextInt();
        String[] names = new String[size];
        sc.nextLine();
        for (int i = 0; i < size; i++) {
            names[i] = sc.nextLine();
        }

        for (int i = 0; i < size; i++) {
            System.out.println(names[i]);
        }
    }
}


class array_question2 {
    public static void main(String[] args) {
        System.out.print("Enter length for numbers array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] LsNumbers = new int[size];
        sc.nextLine();

        for (int i = 0; i < size; i++) {
            LsNumbers[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.println(LsNumbers[i]);
        }
    }
}


class array_question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] NumberList = new int[size];

        for (int i = 0; i < size; i++) {
            NumberList[i] = sc.nextInt();
        }

        Boolean isAscending = true;

        for (int i = 1; i < size; i++) {
            if (NumberList[i] < NumberList[i - 1]) isAscending = false;
        }


        System.out.println(isAscending);

    }
}