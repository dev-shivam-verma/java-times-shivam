import java.util.Scanner;

class  x_main13 {
    public static void main(String[] args) {
        rectangle house1 = new rectangle(1.0,3.0);
        System.out.println("area: " + house1.getarea());
        System.out.println("parameter" + house1.getparameter());

        house1.setheight(40.0);
        System.out.println("area now:" + house1.getarea());




    }
}

class rectangle{
    private double width;
    private double height;

    //constructors
    rectangle (){
        this.height = 1.0;
        this.width  = 1.0;
    }

    rectangle(double hgt, double wdt){
        this.width = wdt;
        this.height = hgt;
    }



    //methods
    double getarea(){
        return this.height * this.width;
    }
    double getparameter(){
        return 2*(this.width + this.height);
    }

    void setheight(double hgt){
        this.height = hgt;
    }
    void setwidth(double wdt){
        this.width = wdt;
    }
}