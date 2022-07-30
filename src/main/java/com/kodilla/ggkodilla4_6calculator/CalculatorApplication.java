package com.kodilla.ggkodilla4_6calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);

    System.out.println(Calculator.add(120,77));
    System.out.println(Calculator.substract(8,17));


}
}
