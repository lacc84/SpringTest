package hu.flowacademy.test.foodorder.rest;

import hu.flowacademy.test.foodorder.model.Food;
import hu.flowacademy.test.foodorder.repository.Foodrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/food")
public class Foodresource {



        @Autowired
        private Foodrepository foodRepository;

         @GetMapping("/")
        public List<Food> findAll() {
            return foodRepository.findAll();
        }

    @GetMapping("/{id}")
        public Optional<Food> findOne(Long id) {
            return foodRepository.findById(id);
        }

    @PostMapping("/")
        public Food save(Food food) {
            return foodRepository.save(food);
        }
    @PutMapping("/")
        public Food update(Food food) {

            return foodRepository.save(food);
        }

    @DeleteMapping("/{id}")
        public void delete(Long id) {
            foodRepository.deleteById(id);
        }

    @DeleteMapping
        public void deleteAll() {
            foodRepository.deleteAll();
        }
    }










