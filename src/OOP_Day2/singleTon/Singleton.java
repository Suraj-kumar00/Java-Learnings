package OOP_Day2.singleTon;

// singleton class: It just a class which you can let you create only one object.
// So that you should not allow to call the constructor of this class
public class Singleton {

        private Singleton(){

        }


        private static Singleton instance;

        public static Singleton getInstance(){
            // check whether   1 obj only is created or not
            if(instance == null){
                instance = new Singleton();
            }
            return instance;

        }

}
