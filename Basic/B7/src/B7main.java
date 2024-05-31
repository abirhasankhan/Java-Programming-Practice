public class B7main {
    public static void main(String[] args) {
        B7 abir = new B7("Abir",20);
        System.out.println(abir);

        B7 ob = abir.clonePerson();
        System.out.println(ob+"\n");


    }
}
