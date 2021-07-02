package com.awoyomi.FoodOrderAppSpringBoot.Service;


import com.awoyomi.FoodOrderAppSpringBoot.Model.Food;
import com.awoyomi.FoodOrderAppSpringBoot.Repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;



    public Food getFoodByName(String name){
        return foodRepository.getFoodByName(name);
    }

    public void saveFood(Food food) {
        foodRepository.save(food);
    }


}
