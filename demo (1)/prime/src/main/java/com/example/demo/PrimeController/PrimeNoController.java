package com.example.demo.PrimeController;

import com.example.demo.domain.PrimeNumber.Prime;
import com.example.demo.domain.PrimeNumber.PrimeNumber;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PrimeNoController {
    @Resource
    PrimeNumber primeNumber;

    @GetMapping("/prime")
    public String getPrime(Model model) {
        model.addAttribute("PrimeNumber", new Prime());
        return "index";
    }

    @PostMapping("/prime")
    public String generatePrime(@ModelAttribute PrimeNumber primeNumber, BindingResult result, Model model) {
        model.addAttribute("PrimeNumber", primeNumber);
        return "calculate";
    }
}



