package com.tnsif.placementmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.placementmanagement.entity.Placement;

public interface PlacementRepository extends JpaRepository<Placement, Integer>{

}