

class x_main22{
    public static void main(String[] args) {
        try{
            int x = 2/0;
        }catch (ArithmeticException e){
            System.out.println("dont divide by zero!!");
        }
    }
}