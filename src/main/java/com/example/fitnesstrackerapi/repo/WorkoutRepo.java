package com.example.fitnesstrackerapi.repo;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.example.fitnesstrackerapi.repo.entity.Workout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WorkoutRepo {
    private DynamoDBMapper dynamoDBMapper;

    @Autowired
    public WorkoutRepo(DynamoDBMapper mapper) {
        dynamoDBMapper = mapper;
    }

    public Workout save(Workout workout) {
        dynamoDBMapper.save(workout);
        return workout;
    }

    public Workout findById(String id) {

        return dynamoDBMapper.load(Workout.class, id);
    }

    public List<Workout> findAll() {
        return dynamoDBMapper.scan(Workout.class, new DynamoDBScanExpression());
    }
}
