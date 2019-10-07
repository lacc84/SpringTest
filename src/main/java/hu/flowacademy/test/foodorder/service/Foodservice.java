package hu.flowacademy.test.foodorder.service;

import hu.flowacademy.test.foodorder.model.Food;
import hu.flowacademy.test.foodorder.repository.Foodrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


    @Service
    @Transactional
    public class Foodservice {

        @Autowired
        private Foodrepository foodRepository;

        public List<Food> findAll() {
            return foodRepository.findAll();
        }

        public Optional<Food> findOne(Long id) {
            return foodRepository.findById(id);
        }

        public Food save(Food food) {
            return foodRepository.save(food);
        }

        public Food update(Food food) {

            return foodRepository.save(food);
        }
        public void delete(Long id) {
            foodRepository.deleteById(id);
        }

        public void deleteAll() {
            foodRepository.deleteAll();
        }
    }

