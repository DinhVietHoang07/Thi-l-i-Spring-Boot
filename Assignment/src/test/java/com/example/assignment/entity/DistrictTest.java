package com.example.assignment.entity;

import com.example.assignment.repository.DistrictRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class DistrictTest {
    @Autowired
    private DistrictRepository districtRepository;

    @Test
    public void save(){
        District district = new District();
        district.setId("A01");
        district.setName("Tran Thai Tong");

            districtRepository.save(district);
        System.out.println(districtRepository.findAll());

    }
}