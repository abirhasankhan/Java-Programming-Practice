//Basic 2
public class B2 {
    private int a;
    public B2(){
        this.a = a;
    }

    public void setA(int a){
        this.a = a;
    }
    public int payA(int x) {
        return this.a-x;
    }

    public static void main(String[] args){
        B2 ob = new B2();

        ob.setA(20);
        System.out.println("The card number is : "+ob.payA(0));
        System.out.println("The card number is : "+ob.payA(5));


    }
}
