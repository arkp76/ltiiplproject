package com.wecp.progressive.service.impl;
<<<<<<< HEAD

import com.wecp.progressive.entity.Match;
import com.wecp.progressive.exception.NoMatchesFoundException;
import com.wecp.progressive.repository.MatchRepository;
import com.wecp.progressive.repository.TicketBookingRepository;
import com.wecp.progressive.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class MatchServiceImplJpa implements MatchService {

    private MatchRepository matchRepository;

    @Autowired
    private TicketBookingRepository ticketBookingRepository;

=======
 
import com.wecp.progressive.entity.Match;
import com.wecp.progressive.exception.NoMatchesFoundException;
import com.wecp.progressive.repository.MatchRepository;
import com.wecp.progressive.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.sql.SQLException;
import java.util.List;
 
@Service
public class MatchServiceImplJpa implements MatchService {
 
    private MatchRepository matchRepository;
 
>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
    @Autowired
    public MatchServiceImplJpa(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }
<<<<<<< HEAD

=======
 
>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
    @Override
    public List<Match> getAllMatches() throws SQLException {
        return matchRepository.findAll();
    }
<<<<<<< HEAD

=======
 
>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
    @Override
    public Match getMatchById(int matchId) throws SQLException {
        return matchRepository.findByMatchId(matchId);
    }
<<<<<<< HEAD

=======
 
>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
    @Override
    public Integer addMatch(Match match) throws SQLException {
        return matchRepository.save(match).getMatchId();
    }
<<<<<<< HEAD

=======
 
>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
    @Override
    public void updateMatch(Match match) throws SQLException {
        matchRepository.save(match);
    }
<<<<<<< HEAD

    @Override
    public void deleteMatch(int matchId) throws SQLException {
        // ticketBookingRepository.deleteByMatchId(matchId);
        matchRepository.deleteById(matchId);
    }

    @Override
    public List<Match> getAllMatchesByStatus(String status) throws SQLException {
        if(matchRepository.findAll().isEmpty())
        {
            throw new NoMatchesFoundException("no match found");
        }
        List<Match> matchList = matchRepository.findAllByStatus(status);
=======
 
    @Override
    public void deleteMatch(int matchId) throws SQLException {
        matchRepository.deleteById(matchId);
    }
 
    @Override
    public List<Match> getAllMatchesByStatus(String status) throws SQLException {
       
        List<Match> matchList = matchRepository.findAllByStatus(status);
      if(matchList.isEmpty())
      {
        throw new NoMatchesFoundException("No Matches found with status : "+status);
      }
>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
        return matchList;
    }
}