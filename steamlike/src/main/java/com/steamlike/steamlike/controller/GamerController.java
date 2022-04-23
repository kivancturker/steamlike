package com.steamlike.steamlike.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.steamlike.steamlike.business.abstracts.GamerService;
import com.steamlike.steamlike.business.requests.CreateGamerRequest;
import com.steamlike.steamlike.core.results.Result;


@RestController
@RequestMapping("/api/gamer-controller")
public class GamerController {
	
	private GamerService gamerService;

	@Autowired
	public GamerController(GamerService gamerService) {
		super();
		this.gamerService = gamerService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CreateGamerRequest createGamerRequest) {
		
		return this.gamerService.add(createGamerRequest);
	}
	
}	
