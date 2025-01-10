package com.wecp.progressive.exception;

<<<<<<< HEAD
public class NoMatchesFoundException extends RuntimeException{

    public NoMatchesFoundException(String message)
    {
        super(message);
    }
=======
import java.sql.SQLException;

public class NoMatchesFoundException extends SQLException {
   public NoMatchesFoundException(String m) {super(m);}
>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
}