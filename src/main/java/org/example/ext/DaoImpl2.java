package org.example.ext;

import org.example.dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version web");
        double t = 77;
        return t;
    }
}