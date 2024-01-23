package org.sparta.dailyplanet.dto;

import lombok.Getter;

@Getter
public class DailyPlanetRequestDto {
    private Long id;
    private String userName;
    private String userPassword;
    private String todoTitle;
    private String todoContents;
}
