package com.wecp.progressive.exception;

<<<<<<< HEAD
public class TeamCricketerLimitExceededException extends RuntimeException{

    public TeamCricketerLimitExceededException(String message)
    {
        super(message);
    }
}
=======
import java.sql.SQLException;

public class TeamCricketerLimitExceededException extends SQLException {
    public TeamCricketerLimitExceededException(String m){
        super(m);
    }
    }
>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
