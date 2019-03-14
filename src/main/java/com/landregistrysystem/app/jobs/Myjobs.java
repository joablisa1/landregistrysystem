package com.landregistrysystem.app.jobs;

import com.landregistrysystem.app.model.Employee;
import com.landregistrysystem.app.repository.EmployeRepository;
import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class Myjobs implements Job {

    private static int count;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        if(count==1){

        }

    }


}
