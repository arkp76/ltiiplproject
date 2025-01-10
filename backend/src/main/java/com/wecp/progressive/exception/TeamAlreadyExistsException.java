package com.wecp.progressive.exception;

<<<<<<< HEAD
public class TeamAlreadyExistsException extends RuntimeException{

    public TeamAlreadyExistsException(String message)
    {
        super(message);
=======
import java.sql.SQLException;

public class TeamAlreadyExistsException extends SQLException {
    public TeamAlreadyExistsException(String m){
        super(m);
>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
    }
}