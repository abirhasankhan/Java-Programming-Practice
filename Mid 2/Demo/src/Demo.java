import java.util.Random;

interface A{
    void a();
    default String name(){
        return "this name";
    }
}
interface B extends A{
    int b();
}

interface E{
    int l();
}
class C implements B,E{
    public void a(){
        System.out.println("iuhg");
    }
    public int b(){
        return 100;
    }
    public int c(){
        return 500;
    }
    public int l(){
        return 5000;
    }
}

interface True{
    int a = 30;
    int b = 300;
    int c = 3000;
    int n = 30000;
}
class call implements True{
    Random ob = new Random();
    int ask() {
        int pro = (int) ( ob.nextInt());
        if (pro < 60) return a;
        else if (pro < 100) return b;
        else if (pro < 1000)return c;
        else return n;
    }
}


public class Demo {
    public static void main(String[] args) {

        C a = new C();
        a.a();
        System.out.println(a.name());
        System.out.println(a.b());
        System.out.println(a.l());
        System.out.println();

        call ob = new call();
        System.out.println(ob.ask());
    }
}
