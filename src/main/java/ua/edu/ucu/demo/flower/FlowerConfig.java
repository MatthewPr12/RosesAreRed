package ua.edu.ucu.demo.flower;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

import static ua.edu.ucu.demo.flower.FlowerColor.*;
import static ua.edu.ucu.demo.flower.FlowerType.*;

@Configuration
public class FlowerConfig {

    @Bean
    CommandLineRunner commandLineRunner(FlowerRepository repository){
        return args -> {
            Flower tulip = new Flower(
                    12.3,
                    RED,
                    1412.2,
                    TULIP);

            Flower rose = new Flower(
                    32,
                    BLUE,
                    231,
                    ROSE);
            Flower chamomile = new Flower(
                    6.32,
                    VIOLET,
                    243,
                    CHAMOMILE);
            repository.saveAll(List.of(tulip, rose, chamomile));
        };
    }
}
