package hu.flowacademy.test.foodorder.rest;

import hu.flowacademy.test.foodorder.model.Cart;
import hu.flowacademy.test.foodorder.repository.Cartrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cart")
public class Cartresource {

    @Autowired
    private Cartrepository cartrepository;


    @GetMapping("/")
    public List<Cart> findAll() {
        return cartrepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Cart> findOne(Long id) {
        return cartrepository.findById(id);
    }
    @PostMapping
    public Cart save(Cart cart) {
        return cartrepository.save(cart);
    }
@PutMapping
    public Cart update(Cart cart) {

        return cartrepository.save(cart);
    }
@DeleteMapping("/{id}")
    public void delete(Long id) {
        cartrepository.deleteById(id);
    }
    @DeleteMapping("/")
    public void deleteAll() {
        cartrepository.deleteAll();
    }
}
