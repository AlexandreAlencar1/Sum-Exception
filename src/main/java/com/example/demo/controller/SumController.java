package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/sum")

public class SumController {
    
    @GetMapping("/{n1}/{n2}")
    public ResponseEntity<Double> add(@PathVariable("n1") String n1, @PathVariable("n2") String n2) {

        double number1 = 0;
        double number2 = 0;

         try{

            number1 = Double.parseDouble(n1);   
            number2 = Double.parseDouble(n2);

         }catch(NumberFormatException e){

            throw new ArithmeticException("Não é permitidos Letras, Tente Novamente");
         }

         return ResponseEntity.ok(number1 + number2);
        
    }
}
