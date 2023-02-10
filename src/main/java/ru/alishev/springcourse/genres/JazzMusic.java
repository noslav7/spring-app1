package ru.alishev.springcourse.genres;

import org.springframework.context.annotation.Scope;
import ru.alishev.springcourse.Music;

public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "What A Wonderful World";
    }
}
