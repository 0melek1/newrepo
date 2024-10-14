package onlinebookshopping.onlinebookshoppingproject.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import onlinebookshopping.onlinebookshoppingproject.model.Book;

import java.util.HashSet;
import java.util.Set;

@Entity

public class StudentEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    @NotNull
    private String name;

    @NotNull
    private String lastName;

    @NotNull
    @Column(unique = true)
    private String email;

    private String phone;
    private String adress;

    @ManyToMany
    private Set<Book> books = new HashSet<>();

}


