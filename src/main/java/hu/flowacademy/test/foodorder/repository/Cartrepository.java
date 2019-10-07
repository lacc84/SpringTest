package hu.flowacademy.test.foodorder.repository;

import hu.flowacademy.test.foodorder.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Cartrepository extends JpaRepository<Cart, Long> {
}
