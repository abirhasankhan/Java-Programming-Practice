public class Bc1main {
    public static void main(String[] args) {

        Bc1 abir = new Bc1("abir",20);
        System.out.println(abir);

        System.out.println();

        Bc1 santo = new Bc1("Santo",20);
        santo.setHeight(1.5);
        santo.setWeight(69);

        System.out.println(santo);

        System.out.println("Name: "+santo.getName()+" and his body mass index: "+santo.bodyMassIndex() );
    }
}
