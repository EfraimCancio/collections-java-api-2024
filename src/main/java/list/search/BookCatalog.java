package main.java.list.search;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {

    private List<Book> bookCatalog;

    public BookCatalog() {
        this.bookCatalog = new ArrayList<>();
    }

    public void addBook(String title, String author, int publication) {
        bookCatalog.add(new Book(title, author, publication));
    }

    public List<Book> searchByAuthor(String author) {

        List<Book> booksByAuthor = new ArrayList<>();

        if(!bookCatalog.isEmpty()) {
            for(Book b : bookCatalog) {
                if(b.getAuthor().equalsIgnoreCase(author)) {
                    booksByAuthor.add(b);
                }
            }
        }

        return booksByAuthor;
    }

    public List<Book> searchByPublication(int startYear, int endingYear) {
        List<Book> booksByPublication = new ArrayList<>();

        if (!bookCatalog.isEmpty()) {
            for (Book b : bookCatalog) {
                if(b.getPublication() >= startYear && b.getPublication() <= endingYear) {
                    booksByPublication.add(b);
                }
            }
        }
        return booksByPublication;
    }

    public Book searchByTitle(String title) {
        Book bookByTitle = null;
        if (!bookCatalog.isEmpty()) {
            for (Book b : bookCatalog) {
                if(b.getTitle().equalsIgnoreCase(title)){
                    bookByTitle = b;
                    break;
                }
            }
        }
        return bookByTitle;
    }

    public static void main(String[] args) {
        BookCatalog bookCatalog = new BookCatalog();
        bookCatalog.addBook("Livro 1", "Autor 1", 1984);
        bookCatalog.addBook("Livro 1", "Autor 2", 2021);
        bookCatalog.addBook("Livro 2", "Autor 2", 2000);
        bookCatalog.addBook("Livro 3", "Autor 3", 2023);
        bookCatalog.addBook("Livro 4", "Autor 4", 1994);


        System.out.println("Pesquisa de livros por autor: " + bookCatalog.searchByAuthor("Autor 2"));
        System.out.println("Pesquisa de livros por itervalo de tempo: " + bookCatalog.searchByPublication(1994, 2022));
        System.out.println("Pesquisa de livros por titulo: " + bookCatalog.searchByTitle("Livro 1"));
    }
}
