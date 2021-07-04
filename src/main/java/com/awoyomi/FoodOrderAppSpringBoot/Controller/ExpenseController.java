package com.awoyomi.FoodOrderAppSpringBoot.Controller;


import com.awoyomi.FoodOrderAppSpringBoot.Model.Expense;
import com.awoyomi.FoodOrderAppSpringBoot.Model.Food;
import com.awoyomi.FoodOrderAppSpringBoot.Service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

//    @GetMapping("expenses")
//    @ResponseBody
//    public List<Expense> getAllExpenses(){
//        return expenseService.getAllExpense();}


    @GetMapping(value = "expenses")
    @ResponseBody
    public ResponseEntity<List<Expense>> getAllExpenses(){
        List<Expense> expense = expenseService.getAllExpense();
        return  new ResponseEntity< >(expense, HttpStatus.OK);

    }




    @PostMapping("saveExpense")
    @ResponseBody
    public void addNewExpenses(@RequestBody Expense expense){

        System.err.println(expense.getExpenseAmount());
        System.err.println(expense.getTitle());
        System.err.println(expense.getDate());
        expenseService.addNew(expense);}
}




