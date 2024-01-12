
//all methods mapped with @GetMapping so that we can test this from browser no need to install other tools
	
package com.assignment.votecount.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.votecount.service.CandidateService;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping("/")
public class VoteController {

    CandidateService service;
	
	VoteController(CandidateService cservice){
		this.service=cservice;
	}
	//COntroller method for entering candidate
	@GetMapping("entercandidate")
	@ResponseBody
	public String enterCandidate(@RequestParam String name){
		 return this.service.createCandidate(name);
	}

    //Controller method for cast vote
	@GetMapping("castvote")
	@ResponseBody
	public String castVote(@RequestParam String name){
		 return this.service.castVote(name);
	}

    //Controller method for counting vote of candidate
	@GetMapping("countvote")
	@ResponseBody
	public String countVote(@RequestParam String name){
		 return this.service.countVote(name);
	}

    //Controller method for listing candidates with votes
	@GetMapping("listvote")
	@ResponseBody
	public String listVote() throws JsonProcessingException{
		return this.service.listVote();
	}
}
