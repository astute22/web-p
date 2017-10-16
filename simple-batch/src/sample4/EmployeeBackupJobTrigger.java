package sample4;


import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

import sample3.ImageZipJob;

public class EmployeeBackupJobTrigger {

	public static void main(String[] args) throws Exception{
		JobDetail job = JobBuilder.newJob(EmployeeBackupJob.class).build();

		Trigger trigger = TriggerBuilder.newTrigger().withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInMinutes(1).repeatHourlyForever()).build();

		Scheduler scheduler = new StdSchedulerFactory().getScheduler();
		scheduler.scheduleJob(job, trigger);
		scheduler.start();
	}
}
