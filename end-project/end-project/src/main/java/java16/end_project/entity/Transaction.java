package java16.end_project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Transaction {

    @Id
    private Long id;

    private String description;
    private Double amount;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
