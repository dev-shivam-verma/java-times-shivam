class fun_question1{
    public static void main(String[] args) {
        SumUptoN(3);
    }

    static void SumUptoN(int x){
        int sum = 0;
        for(int i = 1; i <= x; i++){
            if(i % 2 != 0 ) sum = sum + i ;
        }
        System.out.println(sum);
    }
}


class fun_question2{
    public static void main(String[] args) {
        Circumference(7);
    }


    static void Circumference(float radius){
        System.out.println(2 * 22.0/7.0 * radius);
    }
}


class fun_question3{
    public static void main(String[] args) {
        HCF(25,20);
    }


    static void HCF(int x, int y){
        int a = x;
        if(x > y) a = y;
        while((x % a != 0) || (y % a != 0)) a--;
        System.out.println(a);
    }
}


class fun_question4{
    public static void main(String[] args) {
        Fabonachi(20);
    }

    static void Fabonachi(int n){
        int a = 1;
        int b = 2;
        System.out.println(a);
        System.out.println(b);
        for(int i = 1; i <= n-2 ; i++ ){
            System.out.println(a + b);
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}