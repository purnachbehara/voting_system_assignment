
/*
 * Entity class for storing data in a local variable 
 * 
 * here we have created a map named as candidates to store the candidate names and their respective amount of votes 
 */

package com.assignment.votecount.entity;

import java.util.HashMap;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class VoteCandidates {

	public void putCandidate(String name) {
		this.candidates.put(name, 0);
	}
	public void updateCandidate(String name,int value) {
		this.candidates.put(name, value);
	}

	private Map<String,Integer> candidates=new HashMap<String ,Integer>();
}
