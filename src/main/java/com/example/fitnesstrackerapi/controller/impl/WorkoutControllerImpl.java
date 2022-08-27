package com.example.fitnesstrackerapi.controller.impl;

import com.example.fitnesstrackerapi.controller.WorkoutController;
import com.example.fitnesstrackerapi.controller.dto.WorkoutDto;
import com.example.fitnesstrackerapi.repo.entity.Workout;
import com.example.fitnesstrackerapi.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorkoutControllerImpl implements WorkoutController {

    private WorkoutService workoutService;

    @Autowired
    public WorkoutControllerImpl(WorkoutService workoutService) {
        this.workoutService = workoutService;
    }

    public ResponseEntity<List<WorkoutDto>> getAllWorkouts() {
        return new ResponseEntity<>(workoutService.getWorkouts(), HttpStatus.OK);
    }

    public ResponseEntity<WorkoutDto> getWorkoutInfo(@PathVariable(value = "workoutId") String workoutId) {
        return new ResponseEntity<>(workoutService.getWorkout(workoutId), HttpStatus.OK);
    }

    public ResponseEntity<WorkoutDto> saveWorkoutInfo(@RequestBody WorkoutDto workoutDto) {

        return new ResponseEntity<>(workoutService.saveWorkout(workoutDto), HttpStatus.CREATED);
    }

    public ResponseEntity<WorkoutDto> updateWorkoutInfo(@RequestBody WorkoutDto workoutDto) {
        return new ResponseEntity<>(workoutService.updateWorkout(workoutDto), HttpStatus.OK);
    }

    public ResponseEntity<WorkoutDto> deleteWorkoutInfo(@PathVariable(value = "workoutId") int workoutId) {
        return new ResponseEntity<>(workoutService.deleteWorkout(workoutId), HttpStatus.OK);
    }

}
