package com.rst.radiostationdata;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RadioController  {

    List<Song> submittedSongs = new ArrayList<>();


    @GetMapping("/songs")
    public String getSongs(Model model){
        model.addAttribute("song",submittedSongs);
        return "songs";
    }

    @PostMapping("/handleSubmit")
    public String submitSong(Song song){
        submittedSongs.add(song);
        return "redirect:/songs";
    }

    @GetMapping("/")
    public String songForm(Model model){
        Song song = new Song();
        model.addAttribute("song",song);
        return "form";

    }
}
