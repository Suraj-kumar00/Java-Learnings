package OOP_Day2.staticExample;

// If i use Test class without static keyword out then the InnerClasses class then the Test a and b will not give error.
//class Test{
//    static String name;
//    public Test(String name){
//        this.name = name;
//    }
//}

public class InnerClasses {
    // if i declare static in this Test class the below Test a and b objects will not give error
    static class Test{
        String name;
        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("suraj");
        Test b = new Test("mohit");

        System.out.println(a.name); // this will show mohit
        System.out.println(b.name); // and this will also show mohit

    }
}
