public class A_IfStatements {

    public static void main(String[] args) {

        int number = 2;

        if (number % 2 != 0) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }

        float totalAmount = 100.5f;
        float discount = 0f;

        if (totalAmount > 50f) {
            discount = 0.1f;
        } else if (totalAmount > 100f) {
            discount = 0.05f;
        } else {
            discount = 0.01f;
        }


        float totalAmountIncludingVAT = (totalAmount - (totalAmount * discount)) * 1.22f;
        System.out.println("Te betalen: " + totalAmountIncludingVAT);


        int x = 8;
        int y = 10;

        if (x > y) {
            System.out.println(x + " > " + y);
        } else if (y > x) {
            System.out.println(y + " > " + x);
        } else {
            System.out.println("I can't choose... I think they are equal...");
        }
    }

}
