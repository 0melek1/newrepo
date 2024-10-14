package onlinebookshopping.onlinebookshoppingproject.service;


import onlinebookshopping.onlinebookshoppingproject.model.Librarian;
import onlinebookshopping.onlinebookshoppingproject.repository.LibrarianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibrarianService {

    @Autowired
    private LibrarianRepository librarianRepository;

    public Librarian registerLibrarian(Librarian librarian){

        return librarianRepository.save(librarian);
    }

    public Librarian login(String email,String password){

        return librarianRepository.findByEmail(email)
                .filter(l -> l.getPassword().equals(password))
                .orElseThrow(() -> new RuntimeException("Invalid credentials"));
    }

    public List<Librarian> getAllLibrarians(){
        return librarianRepository.findAll();
    }
}

