package uk.ac.qub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.ac.qub.repository.AlbumAllFieldsRepository;

@Controller
@RequestMapping
public class AlbumController {

    private final AlbumAllFieldsRepository albumRepository;

    public AlbumController(AlbumAllFieldsRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @GetMapping()
    public String homePage(Model model) {
        model.addAttribute("albums", albumRepository.findAll());
        return "index";
    }
}

