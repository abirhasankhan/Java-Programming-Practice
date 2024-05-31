public class B6main {
    public static void main(String[] args) {
        B6 abir = new B6("abir", 17, 1.5, 59);
        B6 rahat = new B6("Rahat", 18, 2.00, 63);
//*******Abir 01 *********
        System.out.println(abir);
        System.out.println(abir.bodyMassIndex());
        boolean a = abir.isAdult();
            if (a)
                System.out.println("is adult");
            else
                System.out.println("in main");
//*******Abir 02 *********
        abir.increaseAge(1);
        System.out.println(abir);
        boolean a1 = abir.isAdult();
        if (a1)
            System.out.println("is adult");
        else
            System.out.println("in main");

//*******Rahat 01 ********
        System.out.println("\n"+rahat);
        System.out.println(rahat.bodyMassIndex());
        boolean b = rahat.isAdult();
        if (b)
            System.out.println("is adult");
        else
            System.out.println("in main");
//*******Rahat 02 ********
        rahat.increaseAge(-1);
        System.out.println(rahat);
        boolean b1 = rahat.isAdult();
        if (b1)
            System.out.println("is adult");
        else
            System.out.println("in main");
//******has same age********
         boolean x = abir.hasSameAge(rahat);
         System.out.println("\nsame age: "+x);
        }
}

