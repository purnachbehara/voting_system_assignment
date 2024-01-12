/* 
 * Implemetation methods for Candidate service Interface
 * Written business logics for project
 * 
 * */

package com.assignment.votecount.sericeImplementation;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.assignment.votecount.entity.VoteCandidates;
import com.assignment.votecount.service.CandidateService;


@Service
public class CandidateServiceImplement implements CandidateService{

    VoteCandidates votes;
	public CandidateServiceImplement() {
		this.votes=new VoteCandidates();
	}
	
	@Override
	public String createCandidate(String candidateName) {
		if(this.votes.getCandidates().containsKey(candidateName)) {
			return "candidate already exists";}
		else {
			this.votes.putCandidate(candidateName);
			return "Candidate created";
		}
	}


}
