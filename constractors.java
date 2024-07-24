/**
 * constractors
 */
public class constractors {
   
    public static   class  HelloWorld {
        public static String greet;
        public static  String  name;

        HelloWorld(String greet , String name){
            this.greet = greet;
            this.name  = name;
        }

        void  outPut(){
            System.out.println(greet + name );
        }
    }
    public static void main(String[] args) {
        
        HelloWorld t = new HelloWorld("hola" , "John");
        t.outPut();
    }
}