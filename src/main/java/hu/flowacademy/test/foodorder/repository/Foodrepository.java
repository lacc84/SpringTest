package hu.flowacademy.test.foodorder.repository;

import hu.flowacademy.test.foodorder.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface Foodrepository extends JpaRepository<Food, Long> {
}

