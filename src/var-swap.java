//to swap two variables
class x_main10 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a = "+ a + " b = " + b);

        //swapping
        int swapper = a;
        a = b ;
        b = swapper;

        System.out.println("a = "+ a + " b = " + b);
    }
}