# Book-Management-App

Book Management Application in Java

## Description
A simple console-based application to manage a collection of books. Supports adding, viewing, updating, deleting, and searching books.

## Features
- Add new books with title, author, ISBN, and publication year.
- View all books in the library.
- Update existing book details.
- Delete books.
- Search books by title (partial match).

## How to Run
1. Ensure you have Java 8+ installed.
2. Compile the source files: `javac src/main/java/*.java`
3. Run the main class: `java -cp src/main/java Main`
4. Follow the on-screen menu to interact with the app.

## Example Usage
- Add a book: Enter details when prompted.
- View: Lists all books with numbered indices.
- Data is stored in memory (lost on exit). Future enhancements could add file/database persistence.

## Future Enhancements
- GUI using Swing or JavaFX.
- Persistent storage with JSON/CSV files or a database (e.g., SQLite).
- Advanced search/filtering.
- Export/Import books.

## License
MIT License - feel free to fork and modify!