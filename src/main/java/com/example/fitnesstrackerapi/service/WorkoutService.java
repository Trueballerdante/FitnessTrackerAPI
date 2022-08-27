package com.example.fitnesstrackerapi.service;

import com.example.fitnesstrackerapi.controller.dto.WorkoutDto;
import com.example.fitnesstrackerapi.repo.entity.Workout;

import java.util.List;

public interface WorkoutService {

    List<WorkoutDto> getWorkouts();

    WorkoutDto getWorkout(String workoutId);

    WorkoutDto saveWorkout(WorkoutDto workoutDto);

    WorkoutDto updateWorkout(WorkoutDto workoutDto);

    WorkoutDto deleteWorkout(int workoutId);
}
