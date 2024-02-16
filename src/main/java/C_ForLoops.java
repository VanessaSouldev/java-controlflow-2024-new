public class C_ForLoops {

    public static void main(String[] args) {


        for (int i = 3; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Lift off!");


        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(c);
        }
        for (char C = 'A'; C <= 'Z'; C++) {
            System.out.println(C);
        }


        int[] numbers = {4, 3, 6, 8, 2, 3, 2, 2, 0, 9};


        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }

}



