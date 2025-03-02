package com.example.demo.JobService;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.annotation.processing.Generated;

@Entity
@Table(name="job_table")
public class Job {
//    'job_id' is declared as primary key
//    and its value is auto generated
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long job_id;
    String job_name;

//    always must have default constructor


    public Job() {
    }

    public Job(Long id, String name) {
        this.job_id= id;
        this.job_name=name;
    }

    public Long getJob_id() {
        return job_id;
    }

    public void setJob_id(Long job_id) {
        this.job_id = job_id;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }
}
