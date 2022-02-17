package be.ruben.rubenproject.controllers;
import be.ruben.rubenproject.domain.Adres;
import be.ruben.rubenproject.domain.Persoon;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;



import java.time.LocalDate;
import java.time.LocalTime;


@Controller
@RequestMapping("/") // associeert de controller met een URL van de website
 public class IndexController {
    @GetMapping // de method wordt door spring opgeroepen en verwerkt de bijbehorende Get request.

    public ModelAndView index() {
        var morgenOfMiddag = LocalTime.now().getHour() < 12 ? "morgen" : "middag";

        var modelAndView = new ModelAndView("index","moment", morgenOfMiddag);
        modelAndView.addObject("adres",
        new Persoon("Ruben ", "Muanza", 7, true, LocalDate.of(1966, 1, 31),
        new Adres("Grote markt", "3", 2300, "Turnhout")));
        return modelAndView;
    }

}
