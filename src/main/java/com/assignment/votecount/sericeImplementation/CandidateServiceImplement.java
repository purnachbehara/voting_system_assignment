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

    @Override
	public String castVote(String candidateName) {
		if(!this.votes.getCandidates().containsKey(candidateName)) {
			return "Cadidate does't exists";
		}
		else {
			int value=this.votes.getCandidates().get(candidateName);
			this.votes.updateCandidate(candidateName, ++value);
			return candidateName+" "+this.votes.getCandidates().get(candidateName);
		}
	}

    @Override
	public String countVote(String candidateName) {
		if(!this.votes.getCandidates().containsKey(candidateName)) {
			return "Cadidate does't exists";
		}
		else {
			this.votes.getCandidates().get(candidateName);
			return candidateName+" "+this.votes.getCandidates().get(candidateName);
		}
	}
}
