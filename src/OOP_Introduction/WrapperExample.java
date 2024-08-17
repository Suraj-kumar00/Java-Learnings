package OOP_Introduction;

import org.w3c.dom.ls.LSOutput;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 23;
//        int b = 12;


//        Integer num = 234; // this will create an object

        Integer a = 12;
        Integer b = 23;

        swap(a, b);

        System.out.println(a + " " + b);


        A suraj = new A("Suraj bro");
        suraj.name= "bro suraj"; // i can do this


        A obj;
        for ( int i =0; i <1000000000; i++){
            obj = new A("random name");
        }

//        suraj = new A("new suraj"); // this is not allowed, can't reassign it

    }
    // now this num is an object of type integer known as Wrapper class
//        num.equals();


    // Java is pass by value

    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }


    // "final" keyword in java
    // the final variable must be initialized when it is declared
    // if you are using final keyword for the primitive data type you can't change it but if it's not primitive then you change but can't reassign it.


}


class A {
    final int num =12;
    String name;
    public A(String name){
        System.out.println("object created ");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}