


class x_main16{
    public static void main(String[] args) {
        a.meth();
        b.meth();

    }
}


class a{
    static void meth(){
        System.out.println("cheking");
    }
}

class b extends a{
    static void  meth(){
        System.out.println("is this okay??");
    }
}