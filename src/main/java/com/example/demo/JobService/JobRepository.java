package com.example.demo.JobService;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
//    implementation is provided at runtime automatically by JPA

}
