public class Pet {

    private String name;
    private int age;

    public Pet(String n, int a) {
        name = n;
        age = a;
    }

    // Instance method: belongs to the object
    public void speak() {
        System.out.println(name + " says hello!");
    }
}
