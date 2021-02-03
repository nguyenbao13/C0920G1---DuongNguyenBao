package com.codegym.controller;

import com.codegym.entity.customer.Customer;
import com.codegym.entity.customer.CustomerType;
import com.codegym.service.CustomerService;
import com.codegym.service.CustomerTypeService;
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
@RequestMapping("/customer")
public class CustomerController {
    private CustomerService customerService;
    private CustomerTypeService customerTypeService;

    public CustomerController(CustomerService customerService, CustomerTypeService customerTypeService) {
        this.customerService = customerService;
        this.customerTypeService = customerTypeService;
    }
//Request mapping vào tới đây sẽ tự sinh thêm 1 dấu "/" trên url, nên redirect bên dưới phải khai báo "/customer/"
    @GetMapping("")
    public ModelAndView listCustomer(@PageableDefault(value = 5) Pageable pageable,
                                     @RequestParam(value = "name", defaultValue = "") String name) {
        Page<Customer> customerList;
        if(name.equals("")) {
            customerList = customerService.findAll(pageable);
        } else {
            customerList = customerService.searchByName(name, pageable);
        }
        ModelAndView modelAndView = new ModelAndView("customer/list", "customerList", customerList);
        modelAndView.addObject("name",name);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        List<CustomerType> customerTypeList = customerTypeService.findAll();
        ModelAndView modelAndView = new ModelAndView("customer/create", "customer", new Customer());
        modelAndView.addObject("customerTypeList", customerTypeList);
        return modelAndView;
    }

    @PostMapping("/create")
    public String saveCustomer(@Valid @ModelAttribute Customer customer, BindingResult bindingResult,
                               RedirectAttributes redirectAttributes, Model model) {
        if(bindingResult.hasFieldErrors()) {
            List<CustomerType> customerTypeList = customerTypeService.findAll();
            model.addAttribute("customerTypeList", customerTypeList);
            return "customer/create";
        } else {
            customerService.save(customer);
            redirectAttributes.addFlashAttribute("message", "Created successfully !");
            return "redirect:/customer/";
        }
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable Integer id) {
        List<CustomerType> customerTypeList = customerTypeService.findAll();
        Customer customer = customerService.findById(id);
        ModelAndView modelAndView = new ModelAndView("customer/edit", "customer", customer);
        modelAndView.addObject("customerTypeList", customerTypeList);
        return modelAndView;
    }

    @PostMapping("/update")
    public String updateCustomer(@Valid @ModelAttribute Customer customer, BindingResult bindingResult,
                                 RedirectAttributes redirectAttributes, Model model) {
        if(bindingResult.hasFieldErrors()) {
            List<CustomerType> customerTypeList = customerTypeService.findAll();
            model.addAttribute("customerTypeList", customerTypeList);
            model.addAttribute("customer", customer);
            return "customer/edit";
        } else {
            customerService.save(customer);
            redirectAttributes.addFlashAttribute("message", "Updated successfully !");
            return "redirect:/customer/";
        }
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("id_customer") Integer id, RedirectAttributes redirectAttributes) {
        customerService.delete(id);
        redirectAttributes.addFlashAttribute("message", "Deleted successfully !");
        return "redirect:/customer/";
    }

}
