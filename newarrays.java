public class newarrays {
    public static void main(String[] args) {
        int [] ages  = {12,23,56,78,90,};
        String  names [] = {"john","Kevin","Esther"};
        int newages [] = {1,2,3,4,5};
        // System.out.println(ages[4]);

        // System.out.println(ages.length);
        // for (String i : names) {
        //     System.out.println(i);
            
        // }
        // for (int  items : ages) {
        //     System.out.println(items);            
        // }
        // for( int i  = 0; i < names.length; i++){
        //     System.out.println(names[i]);
        // }
        int items = 0;
        do{
            System.out.println(names[items]);
            items++;
        }while(items < names.length);
    }
}
