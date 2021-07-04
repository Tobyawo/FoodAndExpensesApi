package com.awoyomi.FoodOrderAppSpringBoot.Service;

import com.awoyomi.FoodOrderAppSpringBoot.Model.Expense;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ExpenseService {
    List<Expense> getAllExpense();

    void addNew(Expense expense);
}
