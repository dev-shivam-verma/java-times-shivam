import java.util.Date;


class x_main14 {
    public static void main(String[] args) {
        account shivam = new account(1002003,200000,12);
        shivam.requestinfo();
        System.out.println();

        shivam.addbalance(200);
        shivam.requestinfo();
        System.out.println();

        shivam.withdraw(900000);
        System.out.println();

        shivam.withdraw(300);
        shivam.requestinfo();

    }
}

class account{
    private double id;
    private double balance;
    private Date date_created;
    private double ann_intrest;

    account (double id, double balance, double ann_intrest){
        this.id = id;
        this.balance = balance;
        this.ann_intrest = ann_intrest;
        this.date_created = new Date(System.currentTimeMillis());
    }

    //methods
    void addbalance(double amount){
        this.balance += amount;
    }

    void withdraw(double amount){
        if (this.balance >= amount){
            this.balance -= amount;
        } else
            System.out.println("given amount is more than your account balance.");
    }

    void requestinfo (){
        System.out.println("ID: " + this.id);
        System.out.println("Balance: " + this.balance);
        System.out.println("Date created: " + this.date_created);
        System.out.println("Annual intrest rate: " + this.ann_intrest);
    }

    double getid(){
        return this.id;
    }


}