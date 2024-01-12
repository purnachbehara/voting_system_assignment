package com.assignment.votecount.service;


public interface CandidateService {
    //method for creating a candidate
	public String createCandidate(String candidateName);

    //method for casting vote 
	public String castVote(String candidateName);

    //method for count number of votes of a candidate
	public String countVote(String candidateName);
}
