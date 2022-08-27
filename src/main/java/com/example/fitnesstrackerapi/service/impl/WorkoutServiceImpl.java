package com.example.fitnesstrackerapi.service.impl;

import com.example.fitnesstrackerapi.controller.dto.WorkoutDto;
import com.example.fitnesstrackerapi.mapper.WorkoutMapper;
import com.example.fitnesstrackerapi.repo.WorkoutRepo;
import com.example.fitnesstrackerapi.repo.entity.Workout;
import com.example.fitnesstrackerapi.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class WorkoutServiceImpl implements WorkoutService {

    private final WorkoutMapper workoutMapper;
    private final WorkoutRepo workoutRepo;

    @Autowired
    public WorkoutServiceImpl(WorkoutMapper workoutMapper, WorkoutRepo workoutRepo) {

        this.workoutMapper = workoutMapper;
        this.workoutRepo = workoutRepo;
    }

    public List<WorkoutDto> getWorkouts() {
        ArrayList<WorkoutDto> workoutDtos = new ArrayList<WorkoutDto>();
        for (Workout workout : workoutRepo.findAll()) {
            workoutDtos.add(workoutMapper.convert(workout));
        }
        return workoutDtos;
    }

    public WorkoutDto getWorkout(String workoutId) {

        return workoutMapper.convert(workoutRepo.findById(workoutId));
    }

    public WorkoutDto saveWorkout(WorkoutDto workoutDto) {
        Workout w = workoutRepo.save(new Workout(workoutDto.getType(), workoutDto.getMaxWeight()));
        return workoutMapper.convert(w);
    }

    public WorkoutDto updateWorkout(WorkoutDto workoutDto) {
        return null;
    }

    public WorkoutDto deleteWorkout(int workoutId) {
        return null;
    }
}
