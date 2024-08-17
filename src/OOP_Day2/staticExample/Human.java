package OOP_Day2.staticExample;

public class Human {
    int age;
    String name;
    int Salary;
    boolean married;
    static long population; // the properties that are not related to the object but are common to all the object of the class, we declared that as a "static"

    // can create static method and variable


    static void message(){
        System.out.println("Hello World!");
//        System.out.println(this.age); // can't use this over here because the message is static
    }

    // creating a class constructor
     public Human(int age, String name, int Salary, boolean married){
         this.age = age;
         this.name = name;
         this.Salary = Salary;
         this.married = married;
         Human.population +=1;

     }



}
