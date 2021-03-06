package com.usa.retos.controller;

import com.usa.retos.model.Game;
import com.usa.retos.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Game")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping("/all")
    public List<Game> getMachine(){

        return gameService.getAll();
    }

    @GetMapping("/{idGame}")
    public Optional<Game> getMachine (@PathVariable("idGame") int id) {

        return gameService.getMachine(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Game save(@RequestBody Game machine) {

        return gameService.save(machine);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)

    public Game update(@RequestBody Game machine) {

        return gameService.update(machine);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id) {
        return gameService.deleteMachine(id);
    }

}
