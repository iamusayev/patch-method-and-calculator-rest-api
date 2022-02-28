package com.example.springrepeatall.Task3;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/calculator")
public class CalculatorController {

    @GetMapping()
    public Object calculate(@RequestParam Double num1,
                            @RequestParam Operation operation,
                            @RequestParam Double num2) {

        switch (operation) {
            case PLUS:
                return num1 + num2;
            case MINUS:
                return num1 - num2;
            case MULTIPLICATION:
                return num1 * num2;
            case DIVISION:
                return num1 / num2;
        }
            return "You entered incorrect operation";
    }
}
