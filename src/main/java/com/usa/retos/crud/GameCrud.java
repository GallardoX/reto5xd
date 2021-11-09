package com.usa.retos.crud;

import com.usa.retos.model.Game;
import org.springframework.data.repository.CrudRepository;

public interface GameCrud extends CrudRepository<Game, Integer> {
}
