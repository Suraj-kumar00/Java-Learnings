package OOP_Introduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // to store 5 roll numbers of student
        int[] numbers = new int[5];


        // store 5 names of students
        String[] names = new String[5];

        // Data of 5 student: every student container {roll no., name, marks}

        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];


        // But we want some sort of data structures in which every single element container the above things{roll,name,marks}
        // This is where classes object-oriented programming comes into picture


        /* Java Classes: Named group of properties and functions.
        - By conventions class starts with the capital letters
         */

        Student[] students = new Student[5];

//        Student suraj;
//        System.out.println(Student.rno);
//        System.out.println(Arrays.toString(students)); // we'll get null
        Student suraj = new Student(15, "bro suraj",82.4f); // this is creating an object// this Student() is a constructor
        Student mohit = new Student();

        // A constructor will define what happen when your object will be created.
        // And this constructor is a special type of function that is inside the class because this is by default constructor
//        suraj.rno=12;
//        suraj.marks=82.2f; // commented to use default value assigned in class
//        suraj.name="Suraj";
        suraj.changeName("DevOps bro");
        suraj.greeting();
        System.out.println(suraj.rno);
        System.out.println(mohit.name);
        System.out.println(suraj.marks);
        Student random = new Student(suraj);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);


        // Memory  Allocation of "new" keyword
        Student one = new Student();
        Student two = one;

        one.name = "some new thing";
        System.out.println(two.name);


    }
    // Syntax for creating a class: this is basically is template which can be used anywhere.
    // Real-World examples: Human Being class, Car class, etc...
    // The template of class in the programming concept does not exist physically hence does not use memory.
    // So what is class: A class is a template of an Object.(class is an logical construct)
    // What is Object: An object is an instance of a class. ( Physical reality and occupies memory)
//    class Student {
//        int rno;
//        String name;
//        float marks;
//    }

    // The '.' operator/separator to access the object vai class's instance variable( variable inside the object is known as instance variable)
    // e.g: sout(Student.rno) will the the rno.
    //A variable that is declared inside a class but outside any method, constructor, or block. It is associated with an instance of the class (i.e., an object),


}

// for every single student
class Student {
    int rno;
    String name;
    float marks =90; // if we default value

    void greeting(){
        System.out.println("Hello, My name is " +  this.name);// So with and without the this keyword its giving same output why:-
    }

    void changeName(String newName){
        name = newName;
    }

    Student (Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;

    }

// this is called Constructor Overloading
//    Student(){ // it's return type is class Student itself, here name is not required, it's default constructor
//        this.rno=12; // `this` keyword in Java: Refers to the current object in a method or constructor.
//        this.marks=12.4f;
//        this.name="Suraj";
//
//    }

    Student(){
        // this is how you call a constructor from another cunstructor
        // internally : new Student();
        this(13,"default person",55.4f);
        // here what it will does is it will call the bellow constructor

    }




    // Student mohit = new Student(14,"Mohit", 99.9%);
    // here, this will be replaced with mohit
    Student(int rno, String name, float marks){
        this.rno=rno;
        this.marks=marks;
        this.name=name;

    }

    // In java primitive are stored in "stack memory"
    // Why we don't use "new" keyword for creating primitive data types:
    // Because: they are implemented as normal variables, we don't implement as an object.
    // why does java do this: to increase efficiency.





}
