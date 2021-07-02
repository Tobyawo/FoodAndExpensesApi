package com.awoyomi.FoodOrderAppSpringBoot.Service;


import com.awoyomi.FoodOrderAppSpringBoot.Model.Food;
import com.awoyomi.FoodOrderAppSpringBoot.Model.Order;
import com.awoyomi.FoodOrderAppSpringBoot.Model.User;
import com.awoyomi.FoodOrderAppSpringBoot.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public void saveOrderedItems(int quantity, float unitPrice, float totalPrice, User user, Food food){
        Order order = new Order(quantity,unitPrice,totalPrice,user, food);
        orderRepository.save(order);

    }

}
