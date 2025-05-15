package org.lessons.java.spring_la_mia_pizzeria_crud.Controller;

import org.lessons.java.spring_la_mia_pizzeria_crud.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/pizzas")
public class pizzaController {

    @Autowired
    private PizzaRepository repo;

    @GetMapping
    public String index(Model model) {
        return "pizzas/index";
    }

}
