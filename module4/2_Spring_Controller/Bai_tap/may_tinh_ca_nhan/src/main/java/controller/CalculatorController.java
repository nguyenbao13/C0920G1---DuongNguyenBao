package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CalculatorController {

    @RequestMapping("/")
    public String Calculator() {
        return "index";
    }
    @RequestMapping("/calculating")
    public String Calculating(@RequestParam int number1, @RequestParam int number2, @RequestParam String operator,
                              RedirectAttributes redirectAttributes) {
        switch (operator) {
            case "Addition(+)":
                redirectAttributes.addFlashAttribute("result", "Addition: " + (number1+number2));
                break;
            case "Subtraction(-)":
                redirectAttributes.addFlashAttribute("result", "Subtraction: " + (number1-number2));
                break;
            case "Multiplication(x)":
                redirectAttributes.addFlashAttribute("result", "Multiplication: " + (number1*number2));
                break;
            case "Division(/)":
                redirectAttributes.addFlashAttribute("result", "Division: " + (number1/number2));
                break;
        }
        redirectAttributes.addFlashAttribute("number1", number1);
        redirectAttributes.addFlashAttribute("number2", number2);
        return "redirect:/";
    }
}
