public class Bc2 {

    private String name;
    private int age;
    private double height;
    private double weight;

    public Bc2(String name, int age){
        this.name = name;
        this.age = age;
        this.height = 0;
        this.weight = 0;
    }

    //Overload method
    public Bc2(String name,int age,double height, double weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public double bodyMassIndex(){
        double heightDividedByHundred = this.height / 100.0;
        return this.weight / ( heightDividedByHundred * heightDividedByHundred );
    }

    public void agePlus(int age){
        this.age = this.age+age;
    }

    public boolean sameWeight(Bc2 person){
        if (this.weight==person.weight)
            return true;
        else
            return false;
    }

    public Bc2 clone(){
        Bc2 temp = new Bc2(this.name,this.age);
        return temp;
    }
    public Bc2 clone1(){
        Bc2 temp = new Bc2(this.name,this.age,this.height,this.weight);
        return temp;
    }

    public String toString(){
        return this.name+", age: "+this.age+"\nBody mass index: "+this.bodyMassIndex();
    }
}
