import java.lang.reflect.Array;

class fabonacci{
    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);
        fabonacci(0,1,7);
    }

    static void fabonacci(int a, int b, int n){
        if(n == 2) return;
        System.out.println(a + b);
        fabonacci( b ,a+b, n -1);
    }
}


class XtoN{
    public static void main(String[] args) {
        System.out.println(XtopowN(8,2));
    }

    static int XtopowN(int x, int n){
        if(x == 0) return 0; // Base case 2
        if(n == 0) return 1; // Base case 1
        return x* XtopowN(x, n-1 );
    }
}


class ReverseString{
    public static void main(String[] args) {
        reverse("shivam".length()-1, "shivam");
    }

    static void reverse(int n, String s){
        if( n < 0) return;

        System.out.print(s.charAt(n));
        reverse(n-1 , s);
    }
}


class FirstAndLast{
    public static int first = -1;
    public static int last = -1;

    public static void FirstLast( String s, Character checkval, int current ){
        if (current >= s.length()) return;
        if(s.charAt(current) == checkval){
            if (first == -1) first = current;
            else last = current;
        }
        FirstLast(s, checkval, current +1);
    }
    public static void main(String[] args) {
        String name = "        shivamssssssssssssssssssssssssssssssssnot a string";
        FirstLast(name, 's', 0);
        System.out.println(first);
        System.out.println(last);

    }

}


class ifSorted{
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,5,6,7};
        System.out.println(ifSorted(0,arr));

    }

    static Boolean ifSorted(int n, int[] arr){
        if (n == arr.length - 1 ) return true;
        if (arr[n] < arr[n+1]){
            return ifSorted(n+1, arr);
        }else return false;
    }
}


class RemoveDuplicates{
    public static void main(String[] args) {
        RemoveDP(0,"aabbccdd112233Z","");
    }


    static void RemoveDP(int idx, String s, String single){
        if (idx == s.length() -1){
            System.out.println(single);
            return;
        }


        if(single.contains(s.charAt(idx) + "")){
            RemoveDP(idx + 1, s, single);
        }else {
            single += s.charAt(idx);
            RemoveDP(idx + 1, s, single);
        }
    }
}


class Subsequence{
    public static void main(String[] args) {
        PrintSub(0, "abc", "");
    }

    static void PrintSub(int idx, String s, String newstring){
        if (idx == s.length()){
            System.out.println(newstring);
            return;
        }
        PrintSub(idx+1, s, newstring + s.charAt(idx));
        PrintSub(idx+1, s, newstring);

    }
}



class keypad{

    public static void main(String[] args) {
        PrintKey(0,"17658","");
    }

    static String[] options = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    static void PrintKey(int idx, String s, String newstring){
        if(idx == s.length()) {
            System.out.println(newstring);
            return;
        }

        int index = Integer.parseInt(s.charAt(idx) + "");
        for(int i = 0; i < options[index].length(); i++){
            String temp = options[index].charAt(i) + "";
            PrintKey(idx +1, s, newstring + temp);
        }
    }
}