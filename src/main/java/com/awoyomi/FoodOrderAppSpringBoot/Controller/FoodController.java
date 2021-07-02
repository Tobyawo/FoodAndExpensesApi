package com.awoyomi.FoodOrderAppSpringBoot.Controller;


import com.awoyomi.FoodOrderAppSpringBoot.Model.Food;
import com.awoyomi.FoodOrderAppSpringBoot.Repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("/")
public class FoodController {
    @Autowired
    private Food food;

    @Autowired
private FoodRepository foodRepository;


    @GetMapping(value = "foods")
    @ResponseBody
    public List<Food> getAllFood(){
        return foodRepository.findAll();
    }



}
