package be.ruben.rubenproject.controllers;
import be.ruben.rubenproject.domain.Adres;
import be.ruben.rubenproject.domain.Persoon;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;



import java.time.LocalDate;
import java.time.LocalTime;


// enkele imports.
@Controller
@RequestMapping("/")
class IndexController {
    @GetMapping
    public ModelAndView index() {
        var morgenOfMiddag = LocalTime.now().getHour() < 12 ? "morgen" : "middag";
        var modelAndView = new ModelAndView("index","moment", morgenOfMiddag);
        modelAndView.addObject("zaakvoerder",
        new Persoon("Luigi", "Peperone", 7, true, LocalDate.of(1966, 1, 31),
        new Adres("Grote markt", "3", 9700, "Oudenaarde")));
        return modelAndView;

    }
    }


