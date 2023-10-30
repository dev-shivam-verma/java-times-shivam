

class advance_pattern_practice{
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= n ; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }
}


class question1{
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1 ; i <= n ; i++){
            for(int j=1 ; j<= i ; j++){
                if(j == 1 || j == i) System.out.print("*");
                else System.out.print(" ");
            }
            for(int j =1 ; j <= 2*(n-i) ; j ++){
                System.out.print(" ");
            }
            for(int j=1 ; j<= i ; j++){
                if(j == 1 || j == i) System.out.print("*");
                else System.out.print(" ");
            }

            System.out.println();

        }


        for(int i = n ; i >= 1 ; i--){
            for(int j=1 ; j<= i ; j++){
                if(j == 1 || j == i) System.out.print("*");
                else System.out.print(" ");
            }
            for(int j =1 ; j <= 2*(n-i) ; j ++){
                System.out.print(" ");
            }
            for(int j=1 ; j<= i ; j++){
                if(j == 1 || j == i) System.out.print("*");
                else System.out.print(" ");
            }

            System.out.println();

        }
    }
}



class question2{
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1 ; i <= n ; i++){
            int ans = 1 ;
            for(int j =1 ; j <= n-i ; j++) System.out.print(" ");
            System.out.print("1 ");
            for(int j = 1 ; j < i ; j++ ){
                ans = ans * (i-j)  / j;

                System.out.print(ans+" ");
            }

            System.out.println();

        }
    }

}

