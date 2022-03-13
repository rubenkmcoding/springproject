package be.ruben.rubenproject.controllers;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.servlet.*;

import java.util.Arrays;


@Controller
@RequestMapping("os") //De controller verwerkt requests naar de URL os.
public class OsController {

    private static final String[] OSS = {"Windows","Macintosh","Android","Linux"};

    @GetMapping
    public ModelAndView os(@RequestHeader("User-Agent") String userAgent){ /* Spring vult de method parameter userAgent
    met de inhoud van de request header User-Agent vermeld in @RequestHeader*/
        var modelAndView = new ModelAndView("os");
        Arrays.stream(OSS).filter(os -> userAgent.contains(os))
                .findFirst().ifPresent(os -> modelAndView.addObject("os", os));
        return modelAndView;
    }





}
