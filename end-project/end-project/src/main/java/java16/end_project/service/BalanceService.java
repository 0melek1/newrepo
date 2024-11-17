package java16.end_project.service;

import java16.end_project.entity.Balance;
import java16.end_project.repo.BalanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class BalanceService {

    @Autowired
    private BalanceRepository balanceRepository;

    public Balance saveBalance(Balance balance) {
        return balanceRepository.save(balance);
    }

    public List<Balance> getBalancesByUserId(Long userId) {
        return balanceRepository.findByUserId(userId);
    }

    public void deleteBalance(Long id) {
        balanceRepository.deleteById(id);
    }


}
