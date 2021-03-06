package com.example.assignment.seeder;

import com.example.assignment.entity.Street;
import com.example.assignment.entity.enums.StreetSimpleStatus;
import com.example.assignment.repository.StreetRepository;
import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@Slf4j
public class StreetSeeder {
    private static final int NUMBER_DISTRICT_MIN = 1;
    private static final int NUMBER_DISTRICT_MAX = 5;
    private static final int NUMBER_STREET = 10;

    public static List<Street> streets;

    @Autowired
    StreetRepository streetRepository;

    public void generate(){

        log.debug("==========Star Seeding Street=========");
        Faker faker = new Faker();
        streets = new ArrayList<>();
        for (int i = 0; i < NUMBER_STREET; i++) {

            streetRepository.save(Street.builder()
                            .id(UUID.randomUUID().toString())
                            .name(faker.name().fullName())
                            .description(faker.address().city())
                            .status(StreetSimpleStatus.UNDER_CONSTRUCTION)
                    .build());
        }
        log.debug("==========END OF Seeding Street=========");
    }
}
