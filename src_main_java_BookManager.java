import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManager {
    private List<Book> books = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Add a book
    public void addBook() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Enter year: ");
        int year = Integer.parseInt(scanner.nextLine());

        Book book = new Book(title, author, isbn, year);
        books.add(book);
        System.out.println("Book added successfully!");
    }

    // View all books
    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("\n--- Library Books ---");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i));
        }
        System.out.println("----------------------\n");
    }

    // Update a book
    public void updateBook() {
        viewBooks();
        if (books.isEmpty()) return;

        System.out.print("Enter book number to update: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;
        if (index < 0 || index >= books.size()) {
            System.out.println("Invalid index!");
            return;
        }

        Book book = books.get(index);
        System.out.print("Enter new title (or press Enter to keep '" + book.getTitle() + "'): ");
        String input = scanner.nextLine();
        if (!input.isEmpty()) book.setTitle(input);

        System.out.print("Enter new author (or press Enter to keep '" + book.getAuthor() + "'): ");
        input = scanner.nextLine();
        if (!input.isEmpty()) book.setAuthor(input);

        System.out.print("Enter new ISBN (or press Enter to keep '" + book.getIsbn() + "'): ");
        input = scanner.nextLine();
        if (!input.isEmpty()) book.setIsbn(input);

        System.out.print("Enter new year (or press Enter to keep " + book.getYear() + "): ");
        input = scanner.nextLine();
        if (!input.isEmpty()) book.setYear(Integer.parseInt(input));

        System.out.println("Book updated successfully!");
    }

    // Delete a book
    public void deleteBook() {
        viewBooks();
        if (books.isEmpty()) return;

        System.out.print("Enter book number to delete: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;
        if (index < 0 || index >= books.size()) {
            System.out.println("Invalid index!");
            return;
        }

        books.remove(index);
        System.out.println("Book deleted successfully!");
    }

    // Search by title (simple contains check)
    public void searchBook() {
        System.out.print("Enter title to search: ");
        String searchTerm = scanner.nextLine().toLowerCase();
        boolean found = false;

        System.out.println("\n--- Search Results ---");
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(searchTerm)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found.");
        }
        System.out.println("----------------------\n");
    }
}