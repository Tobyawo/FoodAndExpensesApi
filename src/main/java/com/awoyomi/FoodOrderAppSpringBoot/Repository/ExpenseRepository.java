package com.awoyomi.FoodOrderAppSpringBoot.Repository;

import com.awoyomi.FoodOrderAppSpringBoot.Model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
