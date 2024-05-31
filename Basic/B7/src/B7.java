//Basic 007
public class B7 {
    private String name;
    private int age;
    private int a;
    private int b;
    private int c;

    public B7(String name, int age){
        this.name = name;
        this.age = age;
    }
    public B7(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public B7 clonePerson(){
        B7 temp = new B7(this.name,this.age);
        return temp;
    }

    @Override
    public String toString() {
        return this.name+" "+this.age ;
    }
}
