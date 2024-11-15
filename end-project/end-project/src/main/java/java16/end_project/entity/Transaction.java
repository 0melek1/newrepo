package java16.end_project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import java.math.BigDecimal;

@Entity

public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type; // "INCOME" or "EXPENSE"
    private BigDecimal amount;
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;



}
