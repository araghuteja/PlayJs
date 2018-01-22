package com.playJs.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.playJs.model.Player;
import com.playJs.repository.PlayJsRepository;
import com.playJs.utils.MyBeanUtils;

@RestController
@RequestMapping("/api/")
public class PlayJsController {
	
	@Autowired
	private PlayJsRepository repository;

	@RequestMapping(value="player", method= RequestMethod.GET)
	public List<Player> list(){
		return repository.findAll();
	}

	@RequestMapping(value="player/{id}", method= RequestMethod.GET)
	public Player get(@PathVariable Integer id){
		return repository.findOne(id);
	}

	@RequestMapping(value="player", method= RequestMethod.POST)
	public Player create(@RequestBody Player player){
//		player.setCreatedOn(LocalDateTime.now());
		System.out.println("---Player---");
		
		return repository.saveAndFlush(player);
	}

	@RequestMapping(value="player", method= RequestMethod.PUT)
	public Player update(@RequestBody Player player){
		Player existingPlayer = repository.findOne(player.getId());
		MyBeanUtils.myCopyProperties(player, existingPlayer);
		return repository.saveAndFlush(existingPlayer);
	}
	
	@RequestMapping(value="player/{id}", method= RequestMethod.DELETE)
	public Player delete(@PathVariable Integer id){
		Player existingPlayer = repository.findOne(id);
		repository.delete(existingPlayer);
		return existingPlayer;
	}
	
}
