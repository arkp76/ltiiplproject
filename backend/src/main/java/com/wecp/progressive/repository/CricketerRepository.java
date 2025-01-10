package com.wecp.progressive.repository;
<<<<<<< HEAD

import java.util.List;

=======
 
import com.wecp.progressive.entity.Cricketer;
>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
<<<<<<< HEAD

import com.wecp.progressive.entity.Cricketer;

@Repository
public interface CricketerRepository extends JpaRepository<Cricketer, Integer> {

    Cricketer findByCricketerId(int cricketerId);

    List<Cricketer> findByTeam_TeamId(int teamId);

    long countByTeam_TeamId(int teamId);

=======
 
import java.util.List;
 
@Repository
public interface CricketerRepository extends JpaRepository<Cricketer, Integer> {
 
    Cricketer findByCricketerId(int cricketerId);
 
    List<Cricketer> findByTeam_TeamId(int teamId);
     long countByTeam_TeamId(int teamId);
>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
    @Modifying
    @Transactional
    @Query("DELETE FROM Cricketer c WHERE c.team.teamId = :teamId")
    void deleteByTeamId(@Param("teamId") int teamId);
}