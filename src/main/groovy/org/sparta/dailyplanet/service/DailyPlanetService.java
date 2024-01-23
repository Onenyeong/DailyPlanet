package org.sparta.dailyplanet.service;

import org.sparta.dailyplanet.dto.DailyPlanetRequestDto;
import org.sparta.dailyplanet.dto.DailyPlanetResponseDto;
import org.sparta.dailyplanet.entity.DailyPlanet;
import org.sparta.dailyplanet.repository.DailyPlanetRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DailyPlanetService {
    private final DailyPlanetRepository dailyPlanetRepository;
    public DailyPlanetService(DailyPlanetRepository dailyPlanetRepository) {
        this.dailyPlanetRepository = dailyPlanetRepository;
    }

    public DailyPlanetResponseDto createDailyPlanet(DailyPlanetRequestDto requestDto) {
        DailyPlanet dailyPlanet = new DailyPlanet(requestDto);

        DailyPlanet saveDailyPlanet = dailyPlanetRepository.save(dailyPlanet);
        DailyPlanetResponseDto dailyPlanetResponseDto = new DailyPlanetResponseDto(saveDailyPlanet);

        return dailyPlanetResponseDto;
    }
    public List<DailyPlanetResponseDto> getDailyPlanet(){
        return dailyPlanetRepository.findAll().stream().map(DailyPlanetResponseDto::new).toList();
    }
//    public DailyPlanetResponseDto getSelectedDailyPlanet(){
//
//    }
    @Transactional
    public Long updateDailyPlanet(Long id ,DailyPlanetRequestDto requestDto){
        DailyPlanet dailyPlanet = findDailyPlanet(id);
        if (dailyPlanet != null){
            dailyPlanet.update(requestDto);
        }
        return id;
    }
    public Long deleteDailyPlanet(Long id) {
        // 해당 메모가 DB에 존재하는지 확인
        DailyPlanet dailyPlanet = findDailyPlanet(id);

        // memo 삭제
        dailyPlanetRepository.delete(dailyPlanet);

        return id;
    }

    private DailyPlanet findDailyPlanet(Long id) {
        return dailyPlanetRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("선택한 메모는 존재하지 않습니다.")
        );
    }
}
