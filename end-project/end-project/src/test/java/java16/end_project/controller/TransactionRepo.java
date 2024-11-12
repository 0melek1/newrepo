package java16.end_project.controller;

import java16.end_project.Transaction;
import java16.end_project.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/transactions")

public class TransactionRepo {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/balance/{userId}")
    public BigDecimal getUserBalance(@PathVariable Long userId) {
        return transactionService.getUserBalance(userId);
    }

    @PostMapping("/add")
    public Transaction addTransaction(@RequestBody Transaction transaction) {
        return transactionService.saveTransaction(transaction);
    }


}
