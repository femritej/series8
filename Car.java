public class Car {

    private String model;
    private int mileage;

    public Car(String m, int miles) {
        model = m;
        mileage = miles;
    }

    public void drive(int distance) {
        mileage += distance;
    }

    public void printMileage() {
        System.out.println(model + " has " + mileage + " miles.");
    }
}
