package com.awoyomi.FoodOrderAppSpringBoot.Service;


import com.awoyomi.FoodOrderAppSpringBoot.Model.User;
import com.awoyomi.FoodOrderAppSpringBoot.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserByEmail(String email){
        return userRepository.getUserByEmail(email);
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }
}
