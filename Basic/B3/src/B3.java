//Basic 03
public class B3 {
    private String name;
    private int age;

    public B3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printPersion() {
        System.out.println("This person's name is "+this.name + " and this age is " + this.age);
    }

    public static void main(String[] args) {
        B3 abir = new B3("Abir", 19);
        B3 santo = new B3("Santo",20);

        abir.printPersion();
        santo.printPersion();

    }
}



