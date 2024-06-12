package com.example.calculator.controller;

import com.example.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/calculator")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/add")
    public double add(@RequestParam double a, @RequestParam double b){
        return calculatorService.add(a,b);
    }

    @GetMapping("/substract")
    public double substract(@RequestParam double a, @RequestParam double b){
        return calculatorService.substract(a,b);
    }

    @GetMapping("/multiply")
    public double multliply(@RequestParam double a, @RequestParam double b){
        return calculatorService.mult(a,b);
    }

    @GetMapping("/div")
    public double div(@RequestParam double a, @RequestParam double b){
        return calculatorService.div(a,b);
    }

}
