package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sum {
    

     private Double firstNumber;
     private Double secondNumber;


     public Double getSum(){
        return  firstNumber + secondNumber;
      
     }
}
