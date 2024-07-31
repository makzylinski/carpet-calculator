public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new Floor(10, 10), new Carpet(5));
        System.out.println(calculator.getTotalCost());
    }
}
