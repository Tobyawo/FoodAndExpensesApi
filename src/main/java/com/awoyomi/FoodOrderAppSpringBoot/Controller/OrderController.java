package com.awoyomi.FoodOrderAppSpringBoot.Controller;


import com.awoyomi.FoodOrderAppSpringBoot.Model.*;
import com.awoyomi.FoodOrderAppSpringBoot.Service.FoodService;
import com.awoyomi.FoodOrderAppSpringBoot.Service.OrderService;
import com.awoyomi.FoodOrderAppSpringBoot.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin()
@RequestMapping("/")
public class OrderController {

@Autowired
    private UserService userService;
@Autowired
    private FoodService foodService;
@Autowired
    private OrderService orderService;



    @PostMapping("saveOrder")
    @ResponseBody
    public void saveOrders(@RequestBody CheckoutRequest incomingOrder){
        User newUser = new User();
        User user = incomingOrder.getUser();
        newUser.setName(user.getName());
        newUser.setEmail(user.getEmail());
        newUser.setCity(user.getCity());
        newUser.setStreet(user.getStreet());
        newUser.setPostalCode(user.getPostalCode());

        userService.saveUser(newUser);

        Collection<OrderDTO> foodItems = incomingOrder.getOrderedItems();
        for (OrderDTO order:foodItems) {
            Food food = foodService.getFoodByName(order.getName());
            Integer quantity = order.getAmount();
            Float totalPrice = order.getPrice() * quantity;
            orderService.saveOrderedItems(quantity,order.getPrice(),totalPrice,newUser, food);
        }


    }



}
