package de.ehex.database.example.relationaldataaccess;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class CustomerController {

    @GetMapping("/")
    public String (Model model) {
        model.addAttribute("", new ());
        return "";
    }

    @PostMapping("/")
    public String schaetzenSubmit(@ModelAttribute  Klasse platzhalter, Model model) {
        model.addAttribute("", );
        return "";
    }

}
}
