package OOP_Day2.staticExample;


// this is a demo to show initialization of static varibales
public class StaticBlock {
    static int a = 2;
    static int b;

    // Static Block
    // will only run once, when the first obje is created i.e. when the class is loaded for the first time
    static {
        System.out.println("I'm in static block");
        b = a*4;

    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b +=3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);



    }

}
