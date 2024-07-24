public class newOverloading {

    public  static double  addition(double x, double y){
        return  x + y;
    }
    public static int addition(int x,int y){
        return x+y;
    }

     public static void main(String[] args) {
        
        System.out.println(addition(20, 50));
        System.out.println(addition(98.78, 78.90));
    }

}
