public class Ex2 {
    public static void main(String[] args) {
        System.out.println(computeBill(30));
        System.out.println(computeBill(30, 2));
        System.out.println(computeBill(30, 2, 0.1));
    }

    public static double computeBill(double priceOneBook) {
        final double TAX_RATE = 0.8;
        return priceOneBook + (priceOneBook * TAX_RATE);
    }

    public static double computeBill(double priceOneBook, int numberOfBooks) {
        final double TAX_RATE = 0.8;
        return (priceOneBook * numberOfBooks * TAX_RATE) + (priceOneBook * numberOfBooks);
    }

    public static double computeBill(double priceOneBook, int numberOfBooks, double couponValue) {
        final double TAX_RATE = 0.8;
        return (priceOneBook * numberOfBooks * TAX_RATE) + (priceOneBook * numberOfBooks)
                - (priceOneBook * numberOfBooks * couponValue);
    }


}
