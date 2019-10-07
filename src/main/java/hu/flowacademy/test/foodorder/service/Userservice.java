package hu.flowacademy.test.foodorder.service;


import hu.flowacademy.test.foodorder.model.User;
import hu.flowacademy.test.foodorder.repository.Userrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class Userservice {



        @Autowired
        private Userrepository userrepository;

        public List<User> findAll() {
            return userrepository.findAll();
        }

        public Optional<User> findOne(Long id) {
            return userrepository.findById(id);
        }

        public User save(User user) {
            return userrepository.save(user);
        }

    public User update(User user) {

        return userrepository.save(user);

    }
        public void delete(Long id) {
            userrepository.deleteById(id);
        }

        public void deleteAll() {
            userrepository.deleteAll();
        }
    }

