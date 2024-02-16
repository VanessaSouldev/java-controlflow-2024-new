public class D_SwitchStatements {

    public static void main(String[] args) {

        int y = 1;
        switch (y) {
            case 1:
                System.out.println("=one");
                break;
            case 2:
                System.out.println("=two");
                break;
            default:
                System.out.println("!=one && !=two");
        }


        String drink = "Mountain Dew";
        switch (drink) {
            case ("Pepsi"):
                System.out.println("PepsiCo");
                break;
            case ("Fanta"):
                System.out.println("Coca-Cola");
                break;
            case ("Mountain Dew"):
                System.out.println("PepsiCo");
            default:
                System.out.println("onbekend");
        }

    }
}
