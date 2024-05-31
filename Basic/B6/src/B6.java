import org.w3c.dom.ls.LSOutput;

public class B6 {
    private String name;
    private int age;
    private double height;
    private double weight;

    public B6(String name, int age, double height, double weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void increaseAge(int age){
        this.age = this.age+age;
    }

    public double bodyMassIndex(){
        double heightDividedByHundred = this.height/100;
        return this.weight/(heightDividedByHundred*heightDividedByHundred);
    }

    public boolean isAdult(){
        if(this.age>=18)
            return true;
        else
            return false;
    }

    public boolean hasSameAge(B6 person){
        if(this.age==person.age)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "This person name is "+this.name+"\nAge: "+this.age;
    }
}
