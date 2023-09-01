package com.meghana.SportsProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meghana.SportsProject.model.*;
public interface SportsRepository extends JpaRepository<SportsModel,Integer> {

}
