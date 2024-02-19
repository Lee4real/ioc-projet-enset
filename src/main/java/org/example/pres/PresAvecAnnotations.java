
package org.example.pres;

import org.example.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresAvecAnnotations {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("dao","metier","dao2");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("RES ="+metier.calcul());
    }
}