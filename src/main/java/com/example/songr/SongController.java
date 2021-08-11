package com.example.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController {
    @Autowired
    AlbumRespository albumRespository;
    @Autowired
    SongRespository songRespository;
    @GetMapping("/showSongs")
    public String showSongs(Model model){
        //List<Song>songsArray;
        //songsArray= (List<Song>) songRespository.findAll();
        model.addAttribute("songs",songRespository.findAll());

        return "song.html";
    }
    @GetMapping("/album/{id}")
    public String getparticularAlbum(@PathVariable Integer id,Model model){
        //List<Song>songsArray;
        //songsArray= (List<Song>) songRespository.findAll();
      model.addAttribute("particularAlbum",albumRespository.findById(id).get());

        return "particularAlbum.html";
    }
    @PostMapping("/addOneSong/{id}")
    // String title, float length, int trackNumber,String albumSongTitle
    public RedirectView addOneSong(@RequestParam(value = "title")String title, @RequestParam(value = "length")float length, @RequestParam(value = "trackNumber")int trackNumber,@RequestParam(value = "albumSongTitle")String albumSongTitle,@PathVariable Integer id){
        System.out.println(title+trackNumber+albumSongTitle+length);
        Song song=new Song(title,length,trackNumber,albumSongTitle);
        song.setAlbumSong(albumRespository.findById(id).get());
        songRespository.save(song);
        return new RedirectView("/album/{id}");

    }
}
