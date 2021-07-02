package com.awoyomi.FoodOrderAppSpringBoot.Controller;


import com.awoyomi.FoodOrderAppSpringBoot.Model.Food;
import com.awoyomi.FoodOrderAppSpringBoot.Repository.FoodRepository;
import com.awoyomi.FoodOrderAppSpringBoot.Service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin()
@RequestMapping("/")
public class FoodController {
    @Autowired
    private Food food;

    @Autowired
private FoodRepository foodRepository;
    @Autowired
    private FoodService foodService;


    @GetMapping(value = "foods")
    @ResponseBody
    public ResponseEntity<List<Food>> getAllFood(){
    List<Food> food = foodRepository.findAll();
    return  new ResponseEntity< >(food,HttpStatus.OK);

    }

    @PostMapping(value = "savefood")
    @ResponseBody
    public void saveFood(@RequestBody Food food){
        Food newFood = new Food();
        newFood.setId(food.getId());
        newFood.setName(food.getName());
        newFood.setDescription(food.getDescription());
        newFood.setPrice(food.getPrice());
        foodRepository.save(newFood);

    }


}
