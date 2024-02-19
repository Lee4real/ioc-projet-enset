package org.example.dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{

    @Override
    public double getData() {
        System.out.println("Version base de donnée");
        double temp = 25;
        return temp;
    }
}