package com.tnsif.placementmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.placementmanagement.entity.Placement;
import com.tnsif.placementmanagement.repository.PlacementRepository;

@Service
public class PlacementService {

    @Autowired
    private PlacementRepository pr;

    // Create
    public Placement savePlacement(Placement p) {
        return pr.save(p);
    }

    // Read
    public List<Placement> getPlacements() {
        return pr.findAll();
    }

    // Update
    public Placement updatePlacement(Placement p) {
        return pr.save(p);
    }

    // Delete
    public void deletePlacement(Integer id) {
        pr.deleteById(id);
    }

}