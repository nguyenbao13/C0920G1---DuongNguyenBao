package com.codegym.controller;

import com.codegym.entity.Question;
import com.codegym.entity.QuestionType;
import com.codegym.entity.User;
import com.codegym.service.QuestionService;
import com.codegym.service.QuestionTypeService;
import com.codegym.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/question")
public class QuestionController {
    private QuestionService questionService;
    private QuestionTypeService questionTypeService;
    private UserService userService;

    public QuestionController(QuestionService questionService, QuestionTypeService questionTypeService, UserService userService) {
        this.questionService = questionService;
        this.questionTypeService = questionTypeService;
        this.userService = userService;
    }

    @GetMapping("")
    public ModelAndView listCustomer(@PageableDefault(value = 2) Pageable pageable,
                                     @RequestParam(value = "name", defaultValue = "") String name) {
        Page<Question> questionList;
//        if(name.equals("")) {
            questionList = questionService.findAll(pageable);
//        } else {
//            questionList = questionService.searchByName(name, pageable);
//        }
        ModelAndView modelAndView = new ModelAndView("list", "questionList", questionList);
        modelAndView.addObject("name", name);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        List<QuestionType> questionTypeList = questionTypeService.findAll();
        ModelAndView modelAndView = new ModelAndView("create", "question", new Question());
        modelAndView.addObject("questionTypeList", questionTypeList);
        return modelAndView;
    }

    @PostMapping("/create")
    public String saveCustomer(@Valid @ModelAttribute Question question, User user, BindingResult bindingResult,
                               RedirectAttributes redirectAttributes, Model model) {
        if(bindingResult.hasFieldErrors()) {
            List<QuestionType> questionTypeList = questionTypeService.findAll();
            model.addAttribute("questionTypeList", questionTypeList);
            return "create";
        } else {
            userService.save(user);
            questionService.save(question);
            redirectAttributes.addFlashAttribute("message", "Created successfully !");
            return "redirect:";
        }
    }
//
    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable Integer id) {
        List<QuestionType> questionTypeList = questionTypeService.findAll();
        Question question = questionService.findById(id);
        ModelAndView modelAndView = new ModelAndView("edit", "question", question);
        modelAndView.addObject("questionTypeList", questionTypeList);
        return modelAndView;
    }

    @PostMapping("/update")
    public String updateQuestion(@Valid @ModelAttribute Question question, BindingResult bindingResult,
                                 RedirectAttributes redirectAttributes, Model model) {
        if(bindingResult.hasFieldErrors()) {
            List<QuestionType> questionTypeList = questionTypeService.findAll();
            model.addAttribute("questionTypeList", questionTypeList);
            return "edit";
        } else {
            questionService.save(question);
            redirectAttributes.addFlashAttribute("message", "Updated successfully !");
            return "redirect:";
        }
    }
//
//    @GetMapping("/delete")
//    public String deleteCustomer(@RequestParam("id_customer") Integer id, RedirectAttributes redirectAttributes) {
//        customerService.delete(id);
//        redirectAttributes.addFlashAttribute("message", "Deleted successfully !");
//        return "redirect:/customer/";
//    }
}
