package com.example.beststore.controller;

import com.example.beststore.Service.Empservice;
import com.example.beststore.entity.Employee;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;  // Correct import
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class Empcontroller {

    @Autowired
    private Empservice service;

    @GetMapping("/")
    public String home(Model m) {
        List<Employee> emp = service.getAllEmp();
        m.addAttribute("emp", emp);
        return "index";
    }

    @GetMapping("/addemp")
    public String addEmpForm() {
        return "add_emp";
    }

    @PostMapping("/register")
    public String empRegister(@ModelAttribute Employee e, HttpSession session) {
        System.out.println(e);
        service.addEmp(e);
        session.setAttribute("msg", "Employee added successfully...");
        return "redirect:/";
    }
@GetMapping("/edit/{id}")
    public String edit(@PathVariable int id,Model m){
Employee e=service.getEmpById(id);
m.addAttribute("emp",e);
return "edit";
    }
    @PostMapping("/update")
    public String upadte(@ModelAttribute Employee e,HttpSession session)
    {
        service.addEmp(e);
        session.setAttribute("msg", "Employee Data update successfully...");
        return "redirect:/";

    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id,HttpSession session){
        service.deleteEmp(id);
        session.setAttribute("msg","Employee Data Delete successfully...");
        return "redirect:/";
    }
}
