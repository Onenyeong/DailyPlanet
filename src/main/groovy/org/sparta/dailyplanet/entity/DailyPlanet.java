package org.sparta.dailyplanet.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.sparta.dailyplanet.dto.DailyPlanetRequestDto;

@Setter
@Getter
@Entity
@Table(name="dailyplanet")
@NoArgsConstructor
public class DailyPlanet extends Timestamped{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="userName")
    private String userName;
    @JsonIgnore
    @Column(name="userPassword")
    private String userPassword;
    @Column(name="todoTitle")
    private String todoTitle;
    @Column(name="todoContents")
    private String todoContents;


    public DailyPlanet(DailyPlanetRequestDto requestDto){
        this.userName = requestDto.getUserName();
        this.userPassword = requestDto.getUserPassword();
        this.todoTitle = requestDto.getTodoTitle();
        this.todoContents = requestDto.getTodoContents();
    }
    public void update(DailyPlanetRequestDto requestDto) {
        this.userName = requestDto.getUserName();
        this.userPassword = requestDto.getUserPassword();
        this.todoTitle = requestDto.getTodoTitle();
        this.todoContents = requestDto.getTodoContents();
    }
}
