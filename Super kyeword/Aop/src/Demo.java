class A{
   private String a;
   private int b;
        A(){
            System.out.println("this is a");
        }
        A(String x, int y){
            a = x;
            b = y;
        }
        public void display(){
            System.out.println("Color = "+a+"\nNumber = "+b);
        }
    }
 class B extends A{
    private int c;
        B(){
            super();
            System.out.println("this is b");
        }
        B(String x, int y, int z){
            super(x,y);
            c = y;
        }
        @Override
        public void display(){
            super.display();
            System.out.println("point = "+c);
        }
    }

public class Demo {
  public static void main(String[] args) {
        B op = new B();
        B ob = new B("red",300,5);
        ob.display();
    }




}
