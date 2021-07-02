package com.awoyomi.FoodOrderAppSpringBoot.Controller;


import com.awoyomi.FoodOrderAppSpringBoot.Model.User;
import com.awoyomi.FoodOrderAppSpringBoot.Repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("/")
public class UserController {

    private UserRepository userRepository;


    @PostMapping("saveUser")
    @ResponseBody
    public void saveOrders(@RequestBody User user){
       userRepository.save(user);



    }






}
