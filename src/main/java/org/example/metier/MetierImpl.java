package org.example.metier;

import org.example.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier{
    @Autowired
    private IDao dao;

    public MetierImpl(@Qualifier("dao") IDao dao) {
        this.dao = dao;
    }
    public MetierImpl() {
    }

    @Override
    public double calcul() {
        double data = dao.getData();
        double res = data * 23;
        return res;
    }

    public void setDao(IDao dao){
        this.dao = dao;
    }
}