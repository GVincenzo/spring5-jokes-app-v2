package guru.springframework.spring5jokesappv2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5jokesappv2.services.JokeService;

@Controller
public class JokesController {

    private final JokeService service;

    public JokesController(JokeService service) {
        this.service = service;
    }

    @RequestMapping({ "/", "" })
    public String getJoke(Model model) {
        model.addAttribute("joke", service.getJoke());
        return "index";
    }
}
