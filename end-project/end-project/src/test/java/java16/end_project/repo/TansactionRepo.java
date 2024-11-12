package java16.end_project.repo;

import java16.end_project.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

    public interface TransactionRepo extends JpaRepository<Transaction, Long> {
    List<Transaction> findByUserId(Long userId);
}
