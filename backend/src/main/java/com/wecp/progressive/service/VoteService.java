package com.wecp.progressive.service;

import com.wecp.progressive.entity.Vote;

import java.util.List;
import java.util.Map;

<<<<<<< HEAD
public interface VoteService {

    List<Vote> getAllVotes();

    int createVote(Vote vote);

    // Each key (k) represents a category (categories - “Team”, “Batsman”, “Bowler”, “All-rounder” and “Wicketkeeper”)
    // and each value (v) represents the total number of votes for that category.
    Map<String, Long> getVotesCountOfAllCategories();
=======
import org.springframework.http.ResponseEntity;

public interface VoteService {

    ResponseEntity<List<Vote>> getAllVotes();

    ResponseEntity<Integer> createVote(Vote vote);

    // Each key (k) represents a category (categories - “Team”, “Batsman”, “Bowler”, “All-rounder” and “Wicketkeeper”)
    // and each value (v) represents the total number of votes for that category.
    ResponseEntity<Map<String, Long>> getVotesCountOfAllCategories();
>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b

}