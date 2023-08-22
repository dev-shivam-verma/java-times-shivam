

class x_main24{
    public static void main(String[] args) {
        example1 th1 = new example1();
        th1.check();
    }
}


class example1 {
    void check() throws ArithmeticException{
        int a = 2/0;
    }
}