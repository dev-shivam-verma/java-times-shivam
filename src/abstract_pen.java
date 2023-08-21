


abstract class pen {
    abstract void write();
    abstract void refill();
}


class fountain extends pen{
    public void write(){
        System.out.println("hi this is the pen writer");
    }

    public void refill(){
        System.out.println("pen is refilling now");
    }

    public void changenib(){
        System.out.println("changing nib");
    }
}