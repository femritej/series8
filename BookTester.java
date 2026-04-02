public class BookTester {
    public static void main(String[] args) {
        Book b = new Book("The Giver", 180);

        System.out.println(b.getTitle());
        System.out.println(b.getPages());
    }
}
