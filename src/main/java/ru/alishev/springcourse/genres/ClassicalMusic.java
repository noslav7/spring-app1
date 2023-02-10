package ru.alishev.springcourse.genres;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.alishev.springcourse.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("Performing initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong() {
        return "Voices of Spring";
    }
}
