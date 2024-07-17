public class Numbers {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            // Print each number and its corresponding word
            switch (i) {
                case 1:
                    System.out.println("1=one");
                    break;
                case 2:
                    System.out.println("2=two");
                    break;
                case 3:
                    System.out.println("3=three");
                    break;
                case 4:
                    System.out.println("4=four");
                    break;
                case 5:
                    System.out.println("5=five");
                    break;
                case 6:
                    System.out.println("6=six");
                    break;
                case 7:
                    System.out.println("7=seven");
                    break;
                case 8:
                    System.out.println("8=eight");
                    break;
                case 9:
                    System.out.println("9=nine");
                    break;
                default:
                    System.out.println("Number out of range.");
                    break;
            }
        }
    }
}

