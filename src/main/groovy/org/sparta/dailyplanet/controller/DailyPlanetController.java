package org.sparta.dailyplanet.controller;

import org.sparta.dailyplanet.dto.DailyPlanetRequestDto;
import org.sparta.dailyplanet.dto.DailyPlanetResponseDto;
import org.sparta.dailyplanet.service.DailyPlanetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DailyPlanetController {
    private final DailyPlanetService dailyPlanetService;

    public DailyPlanetController(DailyPlanetService dailyPlanetService) {
        this.dailyPlanetService = dailyPlanetService;
    }
    @PostMapping("/dailyPlanets")
    public DailyPlanetResponseDto createDailyPlanet(@RequestBody DailyPlanetRequestDto requestDto){
        return dailyPlanetService.createDailyPlanet(requestDto);
    }
    @GetMapping("/dailyPlanets")
    public List<DailyPlanetResponseDto> getDailyPlanet(){
        return dailyPlanetService.getDailyPlanet();
    }

    @PutMapping("/dailyPlanets/{id}")
    public Long updateDailyPlanet(@PathVariable(value = "id") Long id, @RequestBody DailyPlanetRequestDto requestDto){
        return dailyPlanetService.updateDailyPlanet(id,requestDto);
    }
    @DeleteMapping("/dailyPlanets/{id}")
    // @RequestParam(value="name"
    public Long deleteDailyPlanet(@PathVariable(value = "id") Long id ){
        return dailyPlanetService.deleteDailyPlanet(id);
    }
}
