package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;




    @Configuration
    @ComponentScan(basePackages = "org.example")

    public class PRJConfig {
        @Primary
        @Bean
        public Player player_1() {
            Player player = new Player();
            player.setName("Daulet");
            player.setAge(22);
            return player;
        }

        @Bean
        public Player player_2() {
            Player player = new Player();
            player.setName("Baltash");
            player.setAge(21);
            return player;
        }
        @Primary
        @Bean
        public Description description() {
            Description description = new Description();
            description.setAttack(10);
            description.setDefense(10);
            description.setHP(20);
            return description;
        }
        @Bean
        public Description Prodescription() {
            Description description = new Description();
            description.setAttack(20);
            description.setDefense(20);
            description.setHP(40);
            return description;
        }
    }


