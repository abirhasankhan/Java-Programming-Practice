//Basic 04
public class B4 {
    private String name;
    private int age;

    public B4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void increaseAge(int age){
        this.age = this.age+age;
    }
    @Override
    public String toString() {
        return "This person name is "+this.name+" and his age is "+this.age;
    }

    public static void main(String[] args) {
        B4 abir = new B4("Abir", 19);
        B4 santo = new B4("Santo",20);

        System.out.println(abir);
        abir.increaseAge(1);
        System.out.println(abir);

        System.out.println(santo);
        santo.increaseAge(2);
        System.out.println(santo);
    }
}
