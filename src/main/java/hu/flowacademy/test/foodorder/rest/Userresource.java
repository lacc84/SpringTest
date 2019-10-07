package hu.flowacademy.test.foodorder.rest;


import hu.flowacademy.test.foodorder.model.User;
import hu.flowacademy.test.foodorder.repository.Userrepository;
import hu.flowacademy.test.foodorder.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class Userresource {



        @Autowired
        private Userservice userservice;


    @Autowired
    private Userrepository userrepository;

    @GetMapping("/")
    public List<User> findAll() {
        return userrepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> findOne(Long id) {
        return userrepository.findById(id);
    }

    @PostMapping("/")
    public User save(User user) {
        return userrepository.save(user);
    }

    @PutMapping("/")
    public User update(User user) {

        return userrepository.save(user);

    }

    @DeleteMapping("/{id}")
    public void delete(Long id) {
        userrepository.deleteById(id);
    }

    @DeleteMapping("/")
    public void deleteAll() {
        userrepository.deleteAll();
    }
}
