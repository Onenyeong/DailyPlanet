package org.sparta.dailyplanet.dto;

import lombok.Getter;
import org.sparta.dailyplanet.entity.DailyPlanet;

import java.time.LocalDateTime;

@Getter
public class DailyPlanetResponseDto {
    private Long id;
    private String user_name;
    private String user_password;
    private String todo_title;
    private String todo_contets;


    public DailyPlanetResponseDto(DailyPlanet dailyPlanet) {
        this.id = dailyPlanet.getId();
        this.user_password = dailyPlanet.getUserPassword();
        this.user_name = dailyPlanet.getUserName();
        this.todo_title = dailyPlanet.getTodoTitle();
        this.todo_contets = dailyPlanet.getTodoContents();

    }
}
