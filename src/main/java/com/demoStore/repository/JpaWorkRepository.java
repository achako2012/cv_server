package com.demoStore.repository;

import com.demoStore.entity.Work;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaWorkRepository extends JpaRepository<Work, Long> {
}
