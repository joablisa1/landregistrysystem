package com.landregistrysystem.app.jobs;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class QuartzListerner implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        JobDetail job= JobBuilder.newJob(Myjobs.class).withIdentity("fkcheck","group1").build();
        try{
            Trigger trigger= TriggerBuilder.newTrigger().withIdentity("anyTrigggerName","group1").withSchedule(CronScheduleBuilder.cronSchedule("0/10 * * * * ?")).build();
            Scheduler scheduler=new StdSchedulerFactory().getScheduler();
            scheduler.start();
            scheduler.scheduleJob(job,trigger);

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
