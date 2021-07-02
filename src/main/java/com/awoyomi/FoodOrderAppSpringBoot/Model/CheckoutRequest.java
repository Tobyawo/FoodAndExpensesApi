package com.awoyomi.FoodOrderAppSpringBoot.Model;

import java.util.Collection;

public class CheckoutRequest {

private User user;
private Collection<OrderDTO> orderedItems;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Collection<OrderDTO> getOrderedItems() {
        return orderedItems;
    }

    public void setOrderedItems(Collection<OrderDTO> orderedItems) {
        this.orderedItems = orderedItems;
    }
}
