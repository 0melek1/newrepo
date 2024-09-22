package onlinebookshopping.onlinebookshoppingproject.repository;

import onlinebookshopping.onlinebookshoppingproject.model.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibrarianRepository extends JpaRepository<Librarian, Long> {
}
