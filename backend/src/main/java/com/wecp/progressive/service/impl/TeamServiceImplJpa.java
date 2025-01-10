package com.wecp.progressive.service.impl;
 
<<<<<<< HEAD
import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecp.progressive.dao.TeamDAO;
=======
>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
import com.wecp.progressive.entity.Team;
import com.wecp.progressive.exception.TeamAlreadyExistsException;
import com.wecp.progressive.exception.TeamDoesNotExistException;
import com.wecp.progressive.repository.CricketerRepository;
import com.wecp.progressive.repository.MatchRepository;
import com.wecp.progressive.repository.TeamRepository;
<<<<<<< HEAD
import com.wecp.progressive.repository.TicketBookingRepository;
import com.wecp.progressive.repository.VoteRepository;
import com.wecp.progressive.service.TeamService;
 
@Service
public class TeamServiceImplJpa  implements TeamService {

    private TeamRepository teamRepository;

    @Autowired
    private CricketerRepository cricketerRepository;

    @Autowired
    private MatchRepository matchRepository;

    @Autowired
    private VoteRepository voteRepository;

      @Autowired
    private TicketBookingRepository ticketBookingRepository;

=======
import com.wecp.progressive.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
 
@Service
public class TeamServiceImplJpa  implements TeamService {
 
    private TeamRepository teamRepository;
 
    @Autowired
    CricketerRepository cricketerRepository;
 
    @Autowired
    MatchRepository matchRepository;
 
>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
    @Autowired
    public TeamServiceImplJpa(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }
<<<<<<< HEAD

=======
 
>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
    @Override
    public List<Team> getAllTeams() throws SQLException {
        return teamRepository.findAll();
    }
<<<<<<< HEAD

    @Override
    public int addTeam(Team team) throws SQLException {

        if(teamRepository.findByTeamName(team.getTeamName()) != null){
            throw new TeamAlreadyExistsException("Team with same name exists");
        }
        return teamRepository.save(team).getTeamId();
    }

=======
 
    @Override
    public int addTeam(Team team) throws SQLException {
       if(teamRepository.existsById(team.getTeamId())){
        throw new TeamAlreadyExistsException("Team already exists.");
       }
        return teamRepository.save(team).getTeamId();
    }
 
>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
    @Override
    public List<Team> getAllTeamsSortedByName() throws SQLException {
        List<Team> sortedTeam = teamRepository.findAll();
        sortedTeam.sort(Comparator.comparing(Team::getTeamName));
        return sortedTeam;
    }
<<<<<<< HEAD

    @Override
    public Team getTeamById(int teamId) throws SQLException {
        if(teamRepository.findByTeamId(teamId) == null){
            throw new TeamDoesNotExistException("Team does not exist");
        }
        return teamRepository.findByTeamId(teamId);
    }

    @Override
    public void updateTeam(Team team) throws SQLException {
        if(teamRepository.findByTeamName(team.getTeamName()) != null){
            throw new TeamAlreadyExistsException("Team with same name exists");
        }
        teamRepository.save(team);
    }

    @Override
    public void deleteTeam(int teamId) throws SQLException {
        voteRepository.deleteByTeamId(teamId);
        ticketBookingRepository.deleteByTeamId(teamId);
=======
 
    @Override
    public Team getTeamById(int teamId) throws SQLException {
        return teamRepository.findById(teamId).orElseThrow(()-> new TeamDoesNotExistException("Team doenot exists"));
    }
 
    @Override
    public void updateTeam(Team team) throws SQLException {
     Team tm=  teamRepository.findByTeamName(team.getTeamName());
     if(tm != null)
     {
        throw new TeamAlreadyExistsException("Team already exists.");
     }  
     teamRepository.save(team);
    }
 
    @Override
    public void deleteTeam(int teamId) throws SQLException {
>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
        matchRepository.deleteByTeamId(teamId);
        cricketerRepository.deleteByTeamId(teamId);
        teamRepository.deleteById(teamId);
    }
}