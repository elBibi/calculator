package com.example.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double add(double a, double b){
        return a+b;
    }

    public double substract(double a, double b){
        return a-b;
    }

    public double mult(double a, double b){
        return a*b;
    }

    public double div(double a , double b){
        if(b==0){
            throw new IllegalArgumentException("Cannot divide by Zero");
        }
        return a/b;
    }


}
