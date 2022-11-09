package com.example.demo.exception;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseException {

   public String message;
   public String description;
    
}