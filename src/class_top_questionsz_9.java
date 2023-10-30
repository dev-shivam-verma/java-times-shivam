import java.util.Scanner;

class top_questions {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 0 ; j < n-i ; j++){
                System.out.print(" ");
            }
            for(int x = i ; x >= 1 ; x--){
                System.out.print(x);
            }
            for(int z=2 ; z <= i ; z++){
                System.out.print(z);
            }
            System.out.println();
        }

    }
}