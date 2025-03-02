package com.example.demo.JobService.JobServicePack;

import com.example.demo.JobService.Job;
import com.example.demo.JobService.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobServiceImp implements JobService {
    private List<Job> l = new ArrayList<>();
    @Override
    public List<Job> findAll() {
        return l;
    }

    @Override
    public void add(Job job) {
        l.add(job);
    }

    @Override
    public Job getJobByid(int id) {
        Job j = null;
        for (Job jobs:l){
            if (jobs.getJob_id()==id)
                j=jobs;
        }
        return j;
    }
}
