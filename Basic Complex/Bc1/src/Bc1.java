//Basic complex
public class Bc1 {

    private String name;
    private int age;
    private double height;
    private double weight;

    public Bc1(String name, int age){
        this.name = name;
        this.age = age;
        this.height = 0;
        this.weight = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }

    public double bodyMassIndex(){
        double heightDividedByHundred = this.height / 100.0;
        return this.weight / ( heightDividedByHundred * heightDividedByHundred );
    }

    @Override
    public String toString() {
        return "Name: "+this.name+"\nAge: "+this.age+"\nBody mass index: "+this.bodyMassIndex();
    }
}
