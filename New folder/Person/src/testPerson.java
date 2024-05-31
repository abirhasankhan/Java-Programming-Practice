public class testPerson {

    public static void main(String[] args) {
        Person bob = new Person("Bob",17);
        Person brain = new Person("brain",18,1.6,60);

        System.out.println(bob);
        System.out.println(brain);

        bob.becomeOlder();
 // or       System.out.println(bob);

        System.out.println(bob.getAge());

        brain.becomeOlder(10);
        System.out.println(brain.getAge());

        boolean x = bob.isAdult();
        /** or
        if (x){
            System.out.println("is adult");
        }
        else {
            System.out.println("is main");
        }
**/
        System.out.println("Bob is adult: "+x);

        bob.setWeight(58);
     //   System.out.println(bob.getWeight());

        boolean y = bob.hassameWeight(brain);
        System.out.println("their weight are same: "+y);

        Person clonePerson = bob.clonePerson();
        System.out.println(clonePerson);
    }
}
