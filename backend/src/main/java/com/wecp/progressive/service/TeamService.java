package com.wecp.progressive.service;

import com.wecp.progressive.entity.Team;
<<<<<<< HEAD
import com.wecp.progressive.exception.TeamAlreadyExistsException;
=======
>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b

import java.sql.SQLException;
import java.util.List;

public interface TeamService {

    List<Team> getAllTeams() throws SQLException;

    int addTeam(Team team) throws SQLException;

    List<Team> getAllTeamsSortedByName() throws SQLException;

    default void emptyArrayList() {
    }

    //Do not implement these methods in TeamServiceImplArrayList.java class
    default Team getTeamById(int teamId) throws SQLException {
        return null;
    }

    default void updateTeam(Team team) throws SQLException {}

    default void deleteTeam(int teamId) throws SQLException {}

<<<<<<< HEAD
}
=======
}
>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
