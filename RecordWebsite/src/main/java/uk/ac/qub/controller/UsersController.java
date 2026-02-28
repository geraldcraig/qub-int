package uk.ac.qub.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.ac.qub.model.Users;
import uk.ac.qub.repository.UsersRepository;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UsersController {

    private final UsersRepository usersRepository;

    @GetMapping
    public ResponseEntity<List<Users>> getAllUsers() {
        List<Users> users = usersRepository.findAll();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Users> getUserById(@PathVariable Long id) {
        return usersRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/adduser")
    public ResponseEntity<Users> addUser(@RequestBody Users user) {
        Users savedUser = usersRepository.save(user);
        return ResponseEntity.ok(savedUser);
    }
}

