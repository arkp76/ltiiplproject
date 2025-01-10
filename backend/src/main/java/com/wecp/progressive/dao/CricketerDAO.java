package com.wecp.progressive.dao;
<<<<<<< HEAD
 
import com.wecp.progressive.entity.Cricketer;
import java.sql.SQLException;
import java.util.List;
 
public interface CricketerDAO {
 
    int addCricketer(Cricketer cricketer) throws SQLException;
 
    Cricketer getCricketerById(int cricketerId) throws SQLException;
 
    void updateCricketer(Cricketer cricketer) throws SQLException;
 
    void deleteCricketer(int cricketerId) throws SQLException;
 
=======

import com.wecp.progressive.entity.Cricketer;

import java.sql.SQLException;
import java.util.List;

public interface CricketerDAO {
    int addCricketer(Cricketer cricketer) throws SQLException;
    Cricketer getCricketerById(int cricketerId) throws SQLException;
    void updateCricketer (Cricketer cricketer) throws SQLException;
    void deleteCricketer (int cricketerId) throws SQLException;
>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
    List<Cricketer> getAllCricketers() throws SQLException;
}