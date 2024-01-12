package com.assignment.votecount.service;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface CandidateService {
    //method for creating a candidate
	public String createCandidate(String candidateName);

    //method for casting vote 
	public String castVote(String candidateName);

    //method for count number of votes of a candidate
	public String countVote(String candidateName);

    //method for listing all cadidate's votes in project
	public String listVote() throws JsonProcessingException;

    //method for returning winner
	public String getWinner();
}
