package com.example.fitnesstrackerapi.controller;

import com.example.fitnesstrackerapi.controller.dto.WorkoutDto;
import com.example.fitnesstrackerapi.repo.entity.Workout;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/v1/fitness")
public interface WorkoutController {

    @GetMapping("/workouts")
    ResponseEntity<List<WorkoutDto>> getAllWorkouts();

    @GetMapping("/workout/{workoutId}")
    ResponseEntity<WorkoutDto> getWorkoutInfo(String workoutId);

    @PostMapping("/workout")
    ResponseEntity<WorkoutDto> saveWorkoutInfo(WorkoutDto workoutDto);

    @PutMapping("/workout")
    ResponseEntity<WorkoutDto> updateWorkoutInfo(WorkoutDto workoutDto);

    @DeleteMapping("/workout/{workoutId}")
    ResponseEntity<WorkoutDto> deleteWorkoutInfo(int workoutId);

}
