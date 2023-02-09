package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Black Hole Sun";
    }
}
