
interface shape{
    double getArea();
}

class MYrectangle implements shape{
    double ln;
    double br;

    MYrectangle(double ln,double br ){
        this.ln = ln;
        this.br = br;
    }
    public double getArea(){
        return this.ln * this.br;
    }
}

class mycircle implements shape{
    double radi;
    mycircle(double radi){
        this.radi = radi;
    }

    public double getArea(){
        return this.radi * Math.PI;
    }
}

class square implements shape{
    double side;

    square(double side){
        this.side = side;
    }

    public double getArea(){
        return this.side *  this.side;
    }
}