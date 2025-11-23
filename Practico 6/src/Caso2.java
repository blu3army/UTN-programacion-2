import biblioteca.Author;
import biblioteca.Book;
import biblioteca.Library;

public class Caso2 {

    static void main(String[] args) {
        Library myLibrary = new Library("My Library");

        Author a1 = new Author("1", "Miguel de Cervantes", "España");
        Author a2 = new Author("2", "George Orwell", "UK");
        Author a3 = new Author("3", "Gabriel García Márquez", "Colombia");
        Author a4 = new Author("4", "J. R. R. Tolkien", "UK");

        myLibrary.addBook("123", "The Lord of the Ring: The Ring Fellowship", 1999, a4);
        myLibrary.addBook("246", "The Lord of the Ring: The Two Towers", 2000, a4);
        myLibrary.addBook("789", "100 años de soledad", 1980, a3);
        myLibrary.addBook("852", "Don Quijote de la Mancha", 1780, a1);
        myLibrary.addBook("753", "1984", 1950, a2);

        System.out.println("\nShow up all books");
        myLibrary.showBooks();

        System.out.println("\nSearch book by isbn");
        Book book = myLibrary.searchBookByIsbn("246");
        System.out.println(book.toString());

        System.out.println("\nFilter books by specific year");
        for (Book b: myLibrary.filterBooksByYear(1980)){
            System.out.println(b.toString());
        }

        System.out.println("\nDelete book by isbn");
        myLibrary.deleteBook("789");
        myLibrary.showBooks();

        System.out.println("\nTotal books in the library");
        System.out.println(myLibrary.getBooksQuatinty());

        System.out.println("\nShow all authors who has a book in the library");
        for (Author a: myLibrary.showAvaibleAuthors()){
            System.out.println(a.toString());
        }

    }
}
