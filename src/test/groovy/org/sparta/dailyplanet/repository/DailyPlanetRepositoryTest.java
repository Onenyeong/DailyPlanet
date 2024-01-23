package org.sparta.dailyplanet.repository;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.sparta.dailyplanet.entity.DailyPlanet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
@Transactional
@Rollback(false)
class DailyPlanetRepositoryTest {

    @Autowired
    DailyPlanetRepositoryTest repositoryTest;

    @Test
    @DisplayName("Auditing 기능 적용")
        // given
        DailyPlanet dailyPlanet = DailyPlanet.builder()
                .username("user ")
                .age(20)
                .address("Korfea")
                .build();

        // when
        User savedUser = userRepository.save(user);

        // then
        assertNotNull(savedUser.getCreatedAt());
        assertNotNull(savedUser.getUpdatedAt());
    }
}