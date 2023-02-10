package ru.alishev.springcourse.genres;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.alishev.springcourse.Music;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Black Hole Sun";
    }
}
