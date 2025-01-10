package com.wecp.progressive.repository;
<<<<<<< HEAD

import com.wecp.progressive.entity.Team;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

=======
 
import com.wecp.progressive.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {
 
>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
    Team findByTeamId(int teamId);
    Team findByTeamName(String teamName);
}