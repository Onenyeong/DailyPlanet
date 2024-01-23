package org.sparta.dailyplanet

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class DailyPlanetApplication {

	static void main(String[] args) {
		SpringApplication.run(DailyPlanetApplication.class, args)
	}

}
