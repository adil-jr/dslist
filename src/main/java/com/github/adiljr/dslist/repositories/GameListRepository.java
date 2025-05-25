package com.github.adiljr.dslist.repositories;

import com.github.adiljr.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {}
