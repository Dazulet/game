package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PRJConfig.class);
        Player player = context.getBean( Player.class);
        player.Sout();
        Description description = context.getBean( Description.class);
        description.Sout();
        System.out.println();
        Player player2 = context.getBean("player_2" ,Player.class);
        player2.Sout();
        Description description2 = context.getBean("Prodescription" ,Description.class);
        description2.Sout();

    }

}