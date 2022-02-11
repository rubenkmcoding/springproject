package be.ruben.rubenproject.controllers;
import org.springframework.boot.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;


@RestController
@RequestMapping("/") // associeert de controller met een URL in je website
public class IndexController {
    @GetMapping // verwerkt de bij behorende Get request, de method wordt door spring opgeroepen.
    public String index(){
        var morgenOfMiddag = LocalTime.now().getHour() < 12 ? "morgen" : "middag";
        return "<!doctype html><html><title><hallo></title><body>Goede " + morgenOfMiddag + "</body></html>";
    }


}
