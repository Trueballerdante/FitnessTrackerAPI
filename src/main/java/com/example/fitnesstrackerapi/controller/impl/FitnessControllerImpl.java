package com.example.fitnesstrackerapi.controller.impl;

import com.example.fitnesstrackerapi.controller.FitnessController;
import org.springframework.web.bind.annotation.*;

@RestController
public class FitnessControllerImpl implements FitnessController {

    public String getFitnessInfo() {
        return "Called getFitnessInfo";
    }

    public void saveFitnessInfo() {

    }

    public void updateFitnessInfo() {

    }

    public void deleteFitnessInfo() {

    }

}
