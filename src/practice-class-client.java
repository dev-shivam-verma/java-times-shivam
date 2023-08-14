import java.util.*;


class x_main15{
    public static void main(String[] args) {

    }
}

class client{
    private int id;
    private String name;
    private String phone;
    private ArrayList<account> accounts;

    client(int id, String name, String phone){
        this.id = id;
        this.name = name;
        this.phone = phone;

    }

    void addAccount(account accu){
        this.accounts.add(accu);
    }


    boolean removeAccount(double accountid){
        boolean flag = false;
        for (account i : accounts){
            if(i.getid() == accountid){
                flag = true;
                this.accounts.remove(i);
                break;
            }
        }

        return flag;
    }

    String tostring(){
        return (this.id + " " + this.name + " " + this.phone + " " + this.accounts) ;
    }


}

