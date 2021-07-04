package com.awoyomi.FoodOrderAppSpringBoot.Service.ServiceImp;


import com.awoyomi.FoodOrderAppSpringBoot.Model.Expense;
import com.awoyomi.FoodOrderAppSpringBoot.Repository.ExpenseRepository;
import com.awoyomi.FoodOrderAppSpringBoot.Service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

@Service
public class ExpenseServiceImpl implements ExpenseService {


    @Autowired
    private ExpenseRepository expenseRepository;


    @Override
    public List<Expense> getAllExpense() {
        return expenseRepository.findAll();
    }

    @Override
    public void addNew(Expense expense) {

        Expense newExpense = new Expense();
        newExpense.setTitle(expense.getTitle());
        newExpense.setExpenseAmount(expense.getExpenseAmount());
        if(expense.getDate()==null){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-dd-MM");
            LocalDateTime now = LocalDateTime.now();
            newExpense.setDate(dtf.format(now));
        }else{
            newExpense.setDate(formatDate(expense.getDate()));}
        expenseRepository.save(newExpense);
    }

    public String formatDate(String date) {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy d,MMMM", Locale.ENGLISH);
//        return LocalDate.parse(date, formatter);

        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ENGLISH);
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-dd-MM", Locale.ENGLISH);
        LocalDate date1 = LocalDate.parse(date, inputFormatter);
        String formattedDate = outputFormatter.format(date1);
        return formattedDate; // prints 10-04-2018








    }

}

