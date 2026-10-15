package com.superflix.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmeController {

    @GetMapping("/api/filmes")
    public String getFilmes() {
        return "Lista de filmes";
    }
}