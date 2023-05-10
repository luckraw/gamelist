package com.example.gamelist.controllers;

import com.example.gamelist.dto.GameDTO;
import com.example.gamelist.dto.GameMinDTO;
import com.example.gamelist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;


    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id) {

        GameDTO result = gameService.findById(id);
        return result;
    }
    @GetMapping
    public List<GameMinDTO> findAll() {

        List<GameMinDTO> result = gameService.findAll();
        return result;
    }

}
