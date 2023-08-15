import java.util.*;

class  test{
    static int count;

    test(){
        count += 1;
    }
}

class x_main17 {
    public static void main(String[] args) {

        test new1 = new test();
        test new2 = new test();

        System.out.println(test.count);
    }

}