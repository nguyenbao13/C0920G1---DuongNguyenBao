package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @RequestMapping("/")
    public String Calculator() {
        return "index";
    }
    @RequestMapping("/calculating")
    public String Calculating(@RequestParam int number1, @RequestParam int number2, @RequestParam String operator, Model model) {
        switch (operator) {
            case "Addition(+)":
                model.addAttribute("result", "Addition: " + (number1+number2));
                break;
            case "Subtraction(-)":
                model.addAttribute("result", "Subtraction: " + (number1-number2));
                break;
            case "Multiplication(x)":
                model.addAttribute("result", "Multiplication: " + (number1*number2));
                break;
            case "Division(/)":
                model.addAttribute("result", "Division: " + (number1/number2));
                break;
        }
        model.addAttribute("number1", number1);
        model.addAttribute("number2", number2);
        return "index";
    }
}
