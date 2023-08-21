
interface BasicAnimal{
    void eat();
    void sleep();

}

class monkey{
    void bite(){
        System.out.println("i am biting you!!");
    }

    void jump(int hight){
        System.out.println("jumping "+hight+" meters high!!");
    }
}


class human extends monkey implements BasicAnimal{
    @Override
     public void eat(){
        System.out.println(this+"is eating now");
    }

    @Override
    public void sleep() {
        System.out.println(this+" is sleeping!!");
    }
}