public class Start {
    public static void main(String[] args) {
       
        Book book1 = new Book();
        Book book2 = new Book("1234567", "Java ", "Nion", 99.00, 100);

        
        book1.setIsbn("987654321");
        book1.setBookTitle("Data structure");
        book1.setAuthorName("Thomas");
        book1.setPrice(69.50);
        book1.setAvailableQuantity(50);

        System.out.println("Book 1 Details:");
        book1.showDetails();
        System.out.println();

        System.out.println("Book 2 Details:");
        book2.showDetails();
        System.out.println();

        
        book1.addQuantity(20);
        book2.sellQuantity(10);

        System.out.println("Updated Book 1 Details:");
        book1.showDetails();
        System.out.println();

        System.out.println("Updated Book 2 Details:");
        book2.showDetails();
    }
}