package com.usa.retos.repository;

import com.usa.retos.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import com.usa.retos.crud.GameCrud;

@Repository
public class GameRepository {
    @Autowired
    private GameCrud machineCrud;

    public List<Game> getAll() {
        return (List<Game>) machineCrud.findAll();
    }

    public Optional<Game> getMachine(int id) {
        return machineCrud.findById(id);
    }

    public Game save (Game machine) {
        return machineCrud.save(machine);
    }

    public void delete (Game machine) {
        machineCrud.delete(machine);
    }
}
