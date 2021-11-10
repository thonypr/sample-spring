package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class);

        DigitsRepository repository = context.getBean(DigitsRepository.class);
        repository.save(DigitsPart.builder().id(1).view("000").build());
//        context.close();
//        SpringApplication.run(Application.class);
    }
}