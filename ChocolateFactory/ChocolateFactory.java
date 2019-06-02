public class ChocolateFactory {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        printStatus("instantiated", boiler);

        boiler.fill();
        printStatus("just filled", boiler);

        boiler.boil();
        printStatus("just boiled", boiler);

        boiler.drain();
        printStatus("just drained", boiler);
    }

    private static void printStatus(String header, ChocolateBoiler boiler) {
        if (header != null && !header.isEmpty()) {
            System.out.println("--== " + header.toUpperCase() + " ==--");
        }

        System.out.println("isEmpty: " + boiler.isEmpty());
        System.out.println("isBoiled: " + boiler.isBoiled());
        System.out.println();
    }
}
