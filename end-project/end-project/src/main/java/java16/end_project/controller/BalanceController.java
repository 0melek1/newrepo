package java16.end_project.controller;


import java16.end_project.entity.Balance;
import java16.end_project.service.BalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/balances")

public class BalanceController {

    @Autowired
    private BalanceService balanceService;

    @PostMapping
    public ResponseEntity<Balance> createBalance(@RequestBody Balance balance) {
        return ResponseEntity.ok(balanceService.saveBalance(balance));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<Balance>> getBalances(@PathVariable Long userId) {
        return ResponseEntity.ok(balanceService.getBalancesByUserId(userId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBalance(@PathVariable Long id) {
        balanceService.deleteBalance(id);
        return ResponseEntity.noContent().build();
    }



}
