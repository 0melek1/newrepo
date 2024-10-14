package onlinebookshopping.onlinebookshoppingproject.controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import onlinebookshopping.onlinebookshoppingproject.exception.OurException;
import onlinebookshopping.onlinebookshoppingproject.service.AuthorityService;
import onlinebookshopping.onlinebookshoppingproject.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")

public class UserRestController {

    private final StudentService service:

    private final AuthorityService  authorityService;

    @PostMapping("/register")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@Valid @RequestBody RequestAdduserDTO requestDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw new OurException(" Melumatlarin tamligi pozulub","Validation error",bindingResult);
        }
        service.adduser(requestDTO);


    }
}
