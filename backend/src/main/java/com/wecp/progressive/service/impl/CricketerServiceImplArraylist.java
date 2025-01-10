package com.wecp.progressive.service.impl;
<<<<<<< HEAD
 
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
 
import com.wecp.progressive.entity.Cricketer;
import com.wecp.progressive.service.CricketerService;
 
=======


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.wecp.progressive.entity.Cricketer;
import com.wecp.progressive.service.CricketerService;

>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
public class CricketerServiceImplArraylist implements CricketerService {
private static List<Cricketer> cricketersList =new ArrayList<>();
    @Override
    public List<Cricketer> getAllCricketers() {
       return cricketersList; }
<<<<<<< HEAD
 
    @Override
    public Integer addCricketer(Cricketer cricketer) {
    cricketersList.add(cricketer);
    return cricketersList.size();
    }
 
    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() {
        List<Cricketer> sortedCricketer = cricketersList;
        sortedCricketer.sort(Comparator.comparing(Cricketer::getExperience));
        return  sortedCricketer;
    }
 
=======

    @Override
    public Integer addCricketer(Cricketer cricketer) {
    cricketersList.add(cricketer);
    return cricketersList.size(); 
    }

    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() {
        List<Cricketer> sortedCricketer = cricketersList;
        sortedCricketer.sort(Comparator.comparing(Cricketer :: getExperience));
        return  sortedCricketer;
    }

>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
    @Override
    public void emptyArrayList(){
        cricketersList = new ArrayList<>();
    }
<<<<<<< HEAD
 
   
 
=======

    

>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
}