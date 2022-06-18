package com.example.assignment.repository;

import com.example.assignment.entity.Street;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreetRepository extends CrudRepository<Street, String> {

}
