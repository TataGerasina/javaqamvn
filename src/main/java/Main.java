public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();

        long expected = 30;
        long actual = service.calculate(1_000, true);
        System.out.print(" 1. " + expected + " == ? == " + actual);

        expected = 10;
        actual = service.calculate(1_000, false);
        System.out.print(" 1. " + expected + " == ? == " + actual);

        expected = 500;
        actual = service.calculate(1_000_000, true);
        System.out.print(" 2. " + expected + " == ? == " + actual);

        expected = 500;
        actual = service.calculate(1_000_000, false);
        System.out.print(" 2. " + expected + " == ? == " + actual);

    }
}
