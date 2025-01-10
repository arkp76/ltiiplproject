package com.wecp.progressive.service.impl;
<<<<<<< HEAD

import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecp.progressive.entity.Cricketer;
import com.wecp.progressive.exception.TeamCricketerLimitExceededException;
import com.wecp.progressive.repository.CricketerRepository;
import com.wecp.progressive.repository.VoteRepository;
import com.wecp.progressive.service.CricketerService;

@Service
public class CricketerServiceImplJpa implements CricketerService {

    private CricketerRepository cricketerRepository;

    @Autowired
    private VoteRepository voteRepository;

=======
 
import com.wecp.progressive.entity.Cricketer;
import com.wecp.progressive.exception.TeamCricketerLimitExceededException;
import com.wecp.progressive.repository.CricketerRepository;
import com.wecp.progressive.service.CricketerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;
 
@Service
public class CricketerServiceImplJpa implements CricketerService {
 
    private CricketerRepository cricketerRepository;
 
>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
    @Autowired
    public CricketerServiceImplJpa(CricketerRepository cricketerRepository) {
        this.cricketerRepository = cricketerRepository;
    }
<<<<<<< HEAD

=======
 
>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
    @Override
    public List<Cricketer> getAllCricketers() throws SQLException {
        return cricketerRepository.findAll();
    }
<<<<<<< HEAD

    @Override
    public Integer addCricketer(Cricketer cricketer) throws SQLException {
        int noOfCricketers = cricketerRepository.findAll().size();
        if(noOfCricketers >= 11)
        {
            throw new TeamCricketerLimitExceededException("already 11 cricekters");
        }
        return cricketerRepository.save(cricketer).getCricketerId();
    }

=======
 
    @Override
    public Integer addCricketer(Cricketer cricketer) throws SQLException {
       if(cricketerRepository.countByTeam_TeamId(cricketer.getTeam().getTeamId())>11)
       {
        throw new TeamCricketerLimitExceededException("reached max players");
       }
        return cricketerRepository.save(cricketer).getCricketerId();
    }
 
>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() throws SQLException {
        List<Cricketer> sortedCricketer = cricketerRepository.findAll();
        sortedCricketer.sort(Comparator.comparing(Cricketer::getExperience));
        return sortedCricketer;
    }
<<<<<<< HEAD

=======
 
>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
    @Override
    public void updateCricketer(Cricketer cricketer) throws SQLException {
        cricketerRepository.save(cricketer);
    }
<<<<<<< HEAD

    @Override
    public void deleteCricketer(int cricketerId) throws SQLException {
        voteRepository.deleteByCricketerId(cricketerId);
        cricketerRepository.deleteById(cricketerId);
        
    }

=======
 
    @Override
    public void deleteCricketer(int cricketerId) throws SQLException {
        cricketerRepository.deleteById(cricketerId);
    }
 
>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
    @Override
    public Cricketer getCricketerById(int cricketerId) throws SQLException {
        return cricketerRepository.findByCricketerId(cricketerId);
    }
<<<<<<< HEAD

=======
 
>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
    @Override
    public List<Cricketer> getCricketersByTeam(int teamId) throws SQLException {
        return cricketerRepository.findByTeam_TeamId(teamId);
    }
}