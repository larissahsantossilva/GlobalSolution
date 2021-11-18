package com.fiap.global.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

import com.fiap.global.model.Fruit;
import com.fiap.global.repository.FruitRepository;

@Controller
public class FruitController {

	@Autowired
	FruitRepository fruitRepository;
	
	@GetMapping("/list")
	public String getHome(Model model) {
		
		model.addAttribute("fruits", fruitRepository.findAll());
		return "fruit";
	}
	
	@PostMapping("/add")
    public String addFruit(Fruit fruit, BindingResult result, RedirectAttributes redirectAttributes) {

        if (result.hasErrors()) {
            redirectAttributes.addFlashAttribute("errors", result.getAllErrors());
            return "redirect:list";
        }

        fruitRepository.save(fruit);
        return "redirect:list";
    }
			
	

	@PostMapping("/delete")
	public String deletaFruit(Long id, RedirectAttributes redirectAttributes) {
		
		fruitRepository.deleteById(id);
		redirectAttributes.addFlashAttribute("msg", "Fruta deletada!");
		return "redirect:list";
	}
}
