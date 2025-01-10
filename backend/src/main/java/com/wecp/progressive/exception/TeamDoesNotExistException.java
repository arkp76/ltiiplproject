package com.wecp.progressive.exception;

<<<<<<< HEAD
public class TeamDoesNotExistException extends RuntimeException{

    public TeamDoesNotExistException(String message)
    {
        super(message);
=======
import java.sql.SQLException;

public class TeamDoesNotExistException extends SQLException {
    public TeamDoesNotExistException (String m){
        super(m);
>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
    }
}