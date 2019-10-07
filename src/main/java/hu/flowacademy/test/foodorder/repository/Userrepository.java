package hu.flowacademy.test.foodorder.repository;

import hu.flowacademy.test.foodorder.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepository extends JpaRepository<User, Long> {
}
