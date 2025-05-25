package com.github.adiljr.dslist.repositories;

import com.github.adiljr.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {}
