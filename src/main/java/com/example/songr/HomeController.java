package com.example.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Controller
public class HomeController {

    @GetMapping("/hello")
    @ResponseBody
    public String hellohandler(){
        return ("hello world");
    }
    @GetMapping("/")
    public String homehandler(){
        return "splash.html";
    }

    //String par="hello";
//    @GetMapping("/capitalize/{word}")
//    public String capitalize(Model m, @RequestParam String word){
//       m.addAttribute("name",word.toUpperCase());
//        return "hello.html";
//    }
@GetMapping("/capitalize/{word}")
public String renderCapitalizePage(Model m, @PathVariable String word){
    m.addAttribute("name",word.toUpperCase());
    return "hello.html";
}
@GetMapping("/albums")
public String albumsHandler(Model model){
Album album1=new Album("Hello from the other side","Aseel",4,120,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSbTfqcPQVYpS7wb-uCEzjMx_kMBMZ-dNWekg&usqp=CAU");
    Album album2=new Album("No one","Sara",10,140,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTfm-9YDL-KiV7nA3FK0pQnl81Sr49Il3lhyQ&usqp=CAU");
    Album album3=new Album("Life","Rahmah",15,160,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT56j0-sWadJkNI0U-olG2kXwGvdBpj86kyAA&usqp=CAU");
    List<Album> albums=new ArrayList<Album>();
    albums.add(album1);
    albums.add(album2);
    albums.add(album3);
    model.addAttribute("albums",albums);
    return "albums.html";
}

}
