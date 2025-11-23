package biblioteca;

import java.util.*;

public class Library {
    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(String isbn, String title, int pubicationYear, Author author){
        books.add(
                new Book(isbn, title, pubicationYear, author)
        );
    }

    public void showBooks(){
        for (Book b: books){
            System.out.println(b.toString());
        }
    }

    public Book searchBookByIsbn(String isbn){
        for (Book b: books){
            if (b.getIsbn().equals(isbn)){
                return b;
            }
        }
        return null;
    }

    public void deleteBook(String isbn){
        Iterator<Book> it = books.iterator();
        while (it.hasNext()){
            Book b = it.next();
            if (b.getIsbn().equals(isbn)){
                it.remove();
                System.out.println("Book deleted successfully");
                return;
            }
        }
        System.out.println("We can´t find books with this isbn");
    }

    public int getBooksQuatinty(){
        return books.size();
    }

    public List<Book> filterBooksByYear(int year){
        List<Book> filteredBooks = new ArrayList<>();
        for (Book b: books){
            if (b.getPublicationYear() == year){
                filteredBooks.add(b);
            }
        }

        return filteredBooks;
    }

    public List<Author> showAvaibleAuthors(){
        Set<Author> authors = new HashSet<>();

        for (Book b: books){
            authors.add(b.getAuthor());
        }

        return new ArrayList<>(authors);
    }

}
