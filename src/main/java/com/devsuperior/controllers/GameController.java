package com.devsuperior.controllers;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dto.GameMinDto;
import com.devsuperior.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDto> findAll(){
        return gameService.findAll();
    }
}
