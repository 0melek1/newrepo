package onlinebookshopping.onlinebookshoppingproject.service;


import onlinebookshopping.onlinebookshoppingproject.model.Book;
import onlinebookshopping.onlinebookshoppingproject.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public List<Book> searchBooks(String keyword) {
        // Search logic
        return bookRepository.findAll().stream()
                .filter(book -> book.getTitle().contains(keyword) || book.getAuthor().contains(keyword))
                .collect(Collectors.toList());
    }
}
