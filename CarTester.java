public class CarTester {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 50000);
        Car c2 = new Car("Honda", 30000);

        c1.drive(100);
        c2.drive(250);

        c1.printMileage();
        c2.printMileage();
    }
}
