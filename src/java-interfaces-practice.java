

interface display {
    void on();
    void off();
    void increase_brightness();
    void decrease_brightness();
}

class home_theater implements display{

    public void on(){
        System.out.println("turn on the display");
    }


    public void off(){
        System.out.println("turn off the display");
    }

    public void increase_brightness(){
        System.out.println("increase brightness");
    }

    public void decrease_brightness(){
        System.out.println("decrease brightness");
    }
}