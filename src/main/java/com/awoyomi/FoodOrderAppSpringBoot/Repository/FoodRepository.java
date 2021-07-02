package com.awoyomi.FoodOrderAppSpringBoot.Repository;


import com.awoyomi.FoodOrderAppSpringBoot.Model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
    Food getFoodByName(String name);
}
