//Basic 05
public class B5 {
    private int x;

    public B5(int x){
        this.x = x;
    }

    public void payBill(int y){
        this.x = this.x+y;
    }

    public String toString(){
        return "The card number is "+this.x;
    }
}
