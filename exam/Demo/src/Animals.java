class License {
    String licenseString;
    License(String licenseString){
        this.licenseString = licenseString;
    }
}
interface ISpeaking {
    void speak();
    default void defaultMethodOne(){
        System.out.println("Inside interface ISpeaking");
    }
}
interface ILicensable {
    License getLicense();
    default  void defaultMethodTwo(){
        System.out.println("Default Method of Interface ILicensable Inside ILicensable");
    }
}

class Bird implements ISpeaking {
    String name;
    Bird(String name){
        this.name = name;
    }
    @Override
    public void speak() {
        System.out.println("Tweet");
    }
    @Override
    public void defaultMethodOne() {
        System.out.println("Default Method of Interface ISpeaking Inside Bird");
    }
}

abstract class Pet implements ISpeaking{
    String name;
    public Pet(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    static String run(){
        System.out.println("A pet is running");
        return null;
    }
}

class Dog extends Pet implements ILicensable {
    License stringLicense;
    Dog(String name, License stringLicense){
        super(name);
        this.stringLicense = stringLicense;
    }
    String getName(){
        return this.name;
    }
    @Override
    public void speak() {
        System.out.println("Woof");
    }
    @Override
    public License getLicense() {
        return null;
    }
}
class BullDog extends Dog {
    BullDog(String name, License stringLicense){
        super(name, stringLicense);
    }
    @Override
    public void speak() {
        System.out.println("raooou");
    }
    Bird retrieve(){
        Bird ob = new Bird("kala");
        return ob;
    }
}

class Cat extends Pet {
    Cat(String name){
        super(name);
    }
    @Override
    public void speak() {
        System.out.println("Miao");
    }
}

public class Animals {
    public static void main(String[] args){

        ISpeaking s = new Bird("Woody Woodpecker");
        s.speak();
        s.defaultMethodOne();
        System.out.println();

        s = new Cat("Tom");
        s.speak();
        s.defaultMethodOne();
        System.out.println();

        Dog d = new Dog("Scooby-Doo", new License("Scooby1111"));
        d.speak();
        d.defaultMethodOne();
        d.defaultMethodTwo();
        d.run();
        System.out.println();


        Pet p = new BullDog("Tasmanian Devil", new License("Tasmanian123"));
        p.speak();
        p.defaultMethodOne();
        p.run();
        System.out.println();

        Bird b = new BullDog("Brian Griffin", new License("Brian234")).retrieve();
        b.speak();

    }

}
