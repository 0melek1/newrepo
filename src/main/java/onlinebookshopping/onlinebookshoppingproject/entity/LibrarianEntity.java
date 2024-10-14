package onlinebookshopping.onlinebookshoppingproject.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class LibrarianEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    @Column(unique = true)
    private String email;

    @NotNull
    private String password;

    private String phone;
    private String address;




}
