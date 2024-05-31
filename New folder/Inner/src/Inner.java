import javax.swing.*;

class out{

    private String name = "Abir";
    void disin(){
        for(int i = 0 ; i < 5 ; i++){
            class inn{
                void display(){
                    System.out.println(name);
                }
            }
            inn ob = new  inn();
            ob.display();
        }
    }



}

public class Inner {
    public static void main(String[] args) {
        out ob = new out();
        ob.disin();



    }
}
