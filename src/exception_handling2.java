

class x_main23{
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        } catch (RuntimeException with){
            System.out.println("done bhai ");
        }
    }
}