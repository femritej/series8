public class RectangleTester {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(3, 4);

        r.printInfo();
        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
    }
}
