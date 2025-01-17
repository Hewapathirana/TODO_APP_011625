package com.ntloc.demo.repo;

import com.ntloc.demo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findTop5ByIsCompletedFalseOrderByCreatedAtDesc();
}
