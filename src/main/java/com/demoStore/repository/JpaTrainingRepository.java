package com.demoStore.repository;

import com.demoStore.entity.Training;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaTrainingRepository extends JpaRepository<Training, Long> {
        }
