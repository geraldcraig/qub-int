package uk.ac.qub.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.ac.qub.model.Album;
import uk.ac.qub.repository.AlbumRepository;

import java.util.List;

@Controller
@RequestMapping
public class AlbumController {

    private final AlbumRepository albumRepository;

    public AlbumController(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

//    @GetMapping()
//    public String homePage(Model model) {
//        model.addAttribute("albums", albumRepository.findAll());
//        return "index";
//    }

    @GetMapping
    public ResponseEntity<List<Album>> getAllAlbums() {
        List<Album> albums = albumRepository.findAll();
        return ResponseEntity.ok(albums);
    }
}

