package com.example.fitnesstrackerapi.mapper;

import com.example.fitnesstrackerapi.controller.dto.WorkoutDto;
import com.example.fitnesstrackerapi.repo.entity.Workout;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring")
public interface WorkoutMapper {

    //Entity -> DTO
    WorkoutDto convert(Workout entity);

    //DTO -> Entity
    Workout convert(WorkoutDto dto);
}

