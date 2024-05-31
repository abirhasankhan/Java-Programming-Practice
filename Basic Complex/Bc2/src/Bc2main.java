public class Bc2main {

    public static void main(String[] args) {

        Bc2 abir = new Bc2("Abir",19);
        Bc2 sidrat = new Bc2("Sidrat",20,1.7,63);

        System.out.println(abir);
        System.out.println(sidrat);

        abir.agePlus(1);
        System.out.println(abir);

        boolean x = abir.sameWeight(sidrat);
        System.out.println("Abir and Sidrat has same weight ?\n"+x);

        Bc2 ob = sidrat.clone();
        System.out.println(ob);



    }
}
