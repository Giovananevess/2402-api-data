package application.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.Autowired;
import application.repository.FilmeRepository;
import java.util.List;
import application.model.Filme;

@RestController
public class FilmeController {

    @Autowired
    FilmeRepository filmeRepository;

    @GetMapping("/filme")
    public List <Filme> listarFilmes() {
        return filmeRepository.findAll();
    }
}