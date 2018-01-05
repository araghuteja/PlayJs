package com.playJs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.playJs.model.Player;

public interface PlayJsRepository extends JpaRepository<Player, Integer> {

}
