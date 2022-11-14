package ua.edu.ucu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.demo.flower.Flower;
import ua.edu.ucu.demo.flower.FlowerColor;
import ua.edu.ucu.demo.flower.FlowerType;
import ua.edu.ucu.demo.flower.Item;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
