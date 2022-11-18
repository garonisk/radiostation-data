package com.rst.radiostationdata;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
        int index = getSongIndex(song.getId());
        if (index == -1000) {
            submittedSongs.add(song);
        }else {
            submittedSongs.set(index,song);
        }
        return "redirect:/songs";
    }

    @GetMapping("/")
    public String songForm(Model model, @RequestParam(required = false) String id ){
        model.addAttribute("song", getSongIndex(id) == -1000 ? new Song() :submittedSongs.get(getSongIndex(id)));
        return "form";
    }

    public Integer getSongIndex(String id){
        for (int i = 0; i < submittedSongs.size(); i++) {
            if (submittedSongs.get(i).getId().equals(id)) return i;
        }
        return -1000;
    }
}
