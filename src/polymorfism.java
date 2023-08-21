

class x_main19{
    public static void main(String[] args) {
        telephone nokia1 = new smartphone();

        nokia1.ring();
        nokia1.lift();
        nokia1.cut();

    }
}



abstract class telephone{
    abstract void ring();

    abstract void lift();

    abstract void cut();
}

class smartphone extends telephone{
    void ring(){
        System.out.println("ring ring");
    }

    void lift(){
        System.out.println("picked up");
    }

    void cut(){
        System.out.println("disconnected!!");
    }


}