package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Match;

import java.sql.SQLException;
import java.util.List;

public interface MatchDAO {
<<<<<<< HEAD
    int addMatch(Match match) throws SQLException ;
    Match getMatchById(int matchId) throws SQLException ;
    void updateMatch(Match match) throws SQLException ;
    void deleteMatch(int matchId) throws SQLException ;
    List<Match> getAllMatches() throws SQLException ;
=======
    int addMatch(Match match) throws SQLException;
    Match getMatchById(int matchId) throws SQLException;
    void updateMatch(Match match) throws SQLException;
    void deleteMatch(int matchId) throws SQLException;
    List<Match> getAllMatches() throws SQLException;
>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
}