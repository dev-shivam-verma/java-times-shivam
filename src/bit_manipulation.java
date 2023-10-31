import java.util.Scanner;

class poweof2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int NO = sc.nextInt();
        if(count1(NO)) System.out.println("YES");
        else System.out.println("NO");
    }

    static Boolean count1(int x){
        int count = 0;
        Boolean ifPower = false;
        if((1 & x) == 1) return false;

        for (int i = 0; i < 32; i++){
            int mask = 1<<i;
            if((mask & x) != 0) count++;

        }
        return count == 1;
    }


}

class ToggleBit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int NO = sc.nextInt();
        System.out.print("Enter the position: ");
        int Pos = sc.nextInt();

        if(((1<<Pos) & NO) != 0){
            int AntiMask = ~(1<<Pos);
            NO &= AntiMask;
        }else{
            int Mask = 1<<Pos;
            NO |= Mask;
        }

        System.out.println(NO);
    }
}


class BitConversion{
    public static void main(String[] args) {
        System.out.println(DecimalTobin(9));
        System.out.println(BinaryToDec("1111"));
    }

    static StringBuilder DecimalTobin(int x){
        StringBuilder BinaryNumber = new StringBuilder();
        while(x != 1){
            BinaryNumber.insert(0,(x % 2));
            x /= 2;
        }
        BinaryNumber.insert(0,(1));
        return BinaryNumber;
    }

    static int BinaryToDec(String x){
        int Result = 0 ;
        StringBuilder BinaryNumber = new StringBuilder(x);
        BinaryNumber = BinaryNumber.reverse();
        for (int i = 0; i < BinaryNumber.length(); i++){
            if(BinaryNumber.charAt(i) == '1') Result += Math.pow(2,i);
        }

        return Result;
    }
}



class bitQuestion2{
    public static void main(String[] args) {

    }
}
