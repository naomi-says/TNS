package com.tnsif.placementmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.placementmanagement.entity.Placement;
import com.tnsif.placementmanagement.service.PlacementService;

@RestController
public class PlacementController {

    @Autowired
    private PlacementService ps;

    @PostMapping("/saveplacement")
    public Placement savePlacement(@RequestBody Placement p) {
        return ps.savePlacement(p);
    }

    @GetMapping("/getplacements")
    public List<Placement> getPlacements() {
        return ps.getPlacements();
    }

    @PutMapping("/updateplacement/{id}")
    public Placement updatePlacement(@PathVariable Integer id,
                                     @RequestBody Placement p) {

        p.setId(id);
        return ps.updatePlacement(p);
    }
    

    @DeleteMapping("/deleteplacement/{id}")
    public void deletePlacement(@PathVariable("id") Integer id) {
        ps.deletePlacement(id);
    }

}