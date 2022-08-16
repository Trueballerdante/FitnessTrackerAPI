package com.example.fitnesstrackerapi.controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/v1")
public interface FitnessController {

    @GetMapping("/fitness")
    String getFitnessInfo();

    @PostMapping("/fitness")
    void saveFitnessInfo();

    @PutMapping("/fitness")
    void updateFitnessInfo();

    @DeleteMapping("/fitness")
    void deleteFitnessInfo();

}
