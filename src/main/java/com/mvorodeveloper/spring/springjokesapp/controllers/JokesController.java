package com.mvorodeveloper.spring.springjokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvorodeveloper.spring.springjokesapp.services.JokesService;

/**
 * Spring Controller for returning random Chuck Norris Jokes
 */
@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping("/")
    public String getChuckNorrisJoke(Model model) {
        model.addAttribute("joke", jokesService.getRandomJoke());

        return "index";
    }
}
