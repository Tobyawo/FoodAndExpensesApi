package com.awoyomi.FoodOrderAppSpringBoot.Model;



import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Component
@Table
public class Expense {
    @Id
    @Column(name="expenseId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    @Column
    private Float expenseAmount;
    @Column
    private String date;


    public Expense(String title, Float expenseAmount, String date) {
        this.title = title;
        this.expenseAmount = expenseAmount;
        this.date = date;
    }

    public Expense() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(Float expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }
}

