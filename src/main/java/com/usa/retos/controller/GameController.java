package com.usa.retos.controller;

import com.usa.retos.model.Game;
import com.usa.retos.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Machine")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class GameController {
    @Autowired
    private GameService machineService;

    @GetMapping("/all")
    public List<Game> getMachine(){

        return machineService.getAll();
    }

    @GetMapping("/{idMachine}")
    public Optional<Game> getMachine (@PathVariable("idMachine") int id) {

        return machineService.getMachine(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Game save(@RequestBody Game machine) {

        return machineService.save(machine);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)

    public Game update(@RequestBody Game machine) {

        return machineService.update(machine);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id) {
        return machineService.deleteMachine(id);
    }

}
