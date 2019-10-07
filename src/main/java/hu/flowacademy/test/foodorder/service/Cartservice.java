package hu.flowacademy.test.foodorder.service;


import hu.flowacademy.test.foodorder.model.Cart;
import hu.flowacademy.test.foodorder.model.Food;
import hu.flowacademy.test.foodorder.repository.Cartrepository;
import hu.flowacademy.test.foodorder.repository.Foodrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class Cartservice {



        @Autowired
        private Cartrepository cartrepository;

        public List<Cart> findAll() {
            return cartrepository.findAll();
        }

        public Optional<Cart> findOne(Long id) {
            return cartrepository.findById(id);
        }

        public Cart save(Cart cart) {
            return cartrepository.save(cart);
        }

    public Cart update(Cart cart) {

        return cartrepository.save(cart);
    }

        public void delete(Long id) {
            cartrepository.deleteById(id);
        }

        public void deleteAll() {
            cartrepository.deleteAll();
        }
    }

