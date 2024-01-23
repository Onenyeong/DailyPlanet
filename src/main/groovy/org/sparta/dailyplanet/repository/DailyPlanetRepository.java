package org.sparta.dailyplanet.repository;

import org.sparta.dailyplanet.entity.DailyPlanet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DailyPlanetRepository extends JpaRepository<DailyPlanet,Long> {

}
