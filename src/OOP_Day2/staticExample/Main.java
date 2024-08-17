package OOP_Day2.staticExample;

public class Main {

    // Now here, we're using static because we can use the Main method without creating the object of that class
    // main the starting point the run the program, if main is not there the porgram will not run
    public static void main(String[] args) {

        Human suraj = new Human(21, "suarj", 10000, false);
        Human mohit = new Human(22,"mohit", 20000,true);
        Human mahesh = new Human(22,"mahesh", 20000,true);


        // Static variables are not depend on object if I comment the above object I can still acces the below Human.population.

        // this is not the right way to access
//        System.out.println(suraj.population );
//        System.out.println(mohit.population);

        // this is
        System.out.println(Human.population);

//        greeting(); // this will give an error because inside static method i can't use anything which is non-static

        Main funn = new Main();
        funn.fun2();
    }


    // this is not dependent on objects
    static void fun(){
//        greeting(); // you can't use this because it requires an instance
        // but the function you are using it in does not depend on instances

        // you can't access non static stuff without referencing their instance in a static context

        // hence, here I'm referencing it
        Main obj = new Main();
        obj.greeting();
    }
    void fun2(){
        greeting();
    }


    // that's why this greeting method should in static
    // we know that something which is not static, belongs to an object.
     void greeting(){
//        fun(); // this we can do because it is static
        System.out.println("hello from static");
    }


}
