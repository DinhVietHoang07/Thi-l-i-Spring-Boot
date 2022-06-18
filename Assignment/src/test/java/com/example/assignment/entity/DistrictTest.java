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
        district.setId("D01");
        district.setId("Bac Tu Liem");
////        District district1 = new District();
////        district1.setId("AO2");
////        district1.setName("nam tu liem");
////        District district2 = new District();
////        district2.setId("AO3");
////        district2.setName("Ho tay");
////        District district3 = new District();
////        district3.setId("AO4");
////        district3.setName("Truong Chinh");
////        District district4 = new District();
////        district4.setId("AO5");
////        district4.setName("Lac Long Quan");
//
            districtRepository.save(district);
////        districtRepository.save(district1);
////        districtRepository.save(district2);
////        districtRepository.save(district3);
////        districtRepository.save(district4);
    }
}