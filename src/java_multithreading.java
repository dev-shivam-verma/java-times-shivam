

class mythread extends Thread{
    public void run(){
        for(int i = 0; i <= 100 ; i++) {
            System.out.println(this + " is running parallaly");

        }
    }
}


class x_main20{
    public static void main(String[] args) {
        mythread th1 = new mythread();
        th1.start();


    }
}