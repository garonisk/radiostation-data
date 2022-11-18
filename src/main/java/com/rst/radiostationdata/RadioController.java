package com.rst.radiostationdata;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RadioController  {

    @GetMapping("/songs")
    public String getSongs(Model model){
        Song song = new Song("Bon Jovi","remedies",100d);
        model.addAttribute("song",song);
        return "songs";
    }
}
