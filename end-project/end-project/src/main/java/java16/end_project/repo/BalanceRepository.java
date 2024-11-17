package java16.end_project.repo;

import java16.end_project.entity.Balance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BalanceRepository extends JpaRepository<Balance, Long> {
    List<Balance> findByUserId(Long userId);



}
