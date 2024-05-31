public class Person {

    private String name;
    private int age;
    private double height;
    private double weight;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        this.height = 0;
        this.weight = 0;
    }
    //overlodiong method
    public Person(String name, int age, double height, double weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return this.weight;
    }

    public void becomeOlder(){
        this.age++;
    }
    //overloding method
    public void becomeOlder(int age){
        this.age = this.age + age;
    }

    public boolean isAdult(){
        if (this.age >= 18)
            return true;
        else
            return false;
    }

    public boolean hassameWeight(Person person){
        if (this.weight == person.weight)
            return true;
        else
            return false;
    }

   public Person clonePerson(){
        Person temp = new Person(this.name , this.age);
        return temp;
   }

     public double bodyMassIndex(){
     double heightDividedByHundred = this.height/100.00;
     return this.weight/(heightDividedByHundred*heightDividedByHundred);
     }

     public String toString(){
         return "Name: "+this.name+" Age: "+this.age+" Body Mass Index: "+bodyMassIndex();
     }
}
