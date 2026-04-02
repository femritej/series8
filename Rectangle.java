public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    public int area() {
        return width * height;
    }

    public int perimeter() {
        return 2 * (width + height);
    }

    public void printInfo() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}
