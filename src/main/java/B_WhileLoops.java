public class B_WhileLoops {

    public static void main(String[] args) {

        int i = 0;

        while (i < 11) {
            System.out.println(i++);
        }


        int x = 20;
        int y = 3;

        while (x * y >= 1) {
            System.out.println("Size = " + x-- + " x " + y--);

        }


        int smallest = 0;
        int largest = 10;
        int numberOfLoops = 0;
        while (smallest < largest) {
            smallest += 3;
            largest -= 0;
            numberOfLoops++;
        }
        System.out.println(numberOfLoops);
    }
}
