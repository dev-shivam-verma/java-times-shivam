
public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        Hanoi(5,"A","B","C");
    }

    static void Hanoi(int n, String source, String helper, String dest) {
        if (n == 1){
            System.out.println("Transfer disk " + n + " from " + source + " to " + dest);
            return;
        }
        Hanoi(n - 1, source, dest, helper);
        System.out.println("Transfer disk " + n + " from " + source + " to " + dest);
        Hanoi(n-1, helper, source, dest);
    }
}