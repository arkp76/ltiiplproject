package com.wecp.progressive.repository;

<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wecp.progressive.entity.Vote;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Integer> {

    Long countByCategory(String category);

    @Modifying
    @Transactional
    @Query("DELETE FROM Vote v WHERE v.team.teamId = :teamId")
    void deleteByTeamId(@Param("teamId") int teamId);

    @Modifying
    @Transactional
    @Query("DELETE FROM Vote v WHERE v.cricketer.cricketerId = :cricketerId")
    void deleteByCricketerId(@Param("cricketerId") int cricketerId);
=======
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wecp.progressive.entity.Vote;
@Repository
public interface VoteRepository extends JpaRepository<Vote,Long>{
    @Query("SELECT v.category AS category, COUNT(v) AS totalVotes FROM Vote v GROUP BY v.category")
    List<Object[]> countVotesByCategory();
 
@Query("DELETE FROM Vote v WHERE v.team.id = :teamId")
    void deleteByTeamId(int teamId);
 
@Query("DELETE FROM Vote v WHERE v.cricketer.id = :cricketerId")
    void deleteByCricketerId(int cricketerId);
>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
}