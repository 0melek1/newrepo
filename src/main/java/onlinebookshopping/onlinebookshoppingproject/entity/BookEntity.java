package onlinebookshopping.onlinebookshoppingproject.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import onlinebookshopping.onlinebookshoppingproject.model.Student;

import java.util.HashSet;
import java.util.Set;

@Entity

public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    @NotNull
    private String title;


    @NotNull
    private String author;

    private String genre;

    @ManyToMany(mappedBy = "books")
    private Set<Student> students = new HashSet<>();

}
