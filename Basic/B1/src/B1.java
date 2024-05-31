//Basic 01
public class B1 {
    private int age;
    public B1(){
        this.age = 18;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public static void main(String[] args) {
        B1 ob = new B1();
        System.out.println("hello world");

        System.out.println(ob.getAge());

        ob.setAge(20);
        System.out.println(ob.getAge());

        ob.setAge(30);
        System.out.println(ob.getAge());
    }
}