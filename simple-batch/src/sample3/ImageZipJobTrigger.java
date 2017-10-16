package sample3;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class ImageZipJobTrigger {

	public static void main(String[] args) throws Exception{
		
		JobDetail job = JobBuilder.newJob(ImageZipJob.class).build();
		
		Trigger trigger = TriggerBuilder.newTrigger().withSchedule(CronScheduleBuilder.cronSchedule("0 0/5 * * * ?")).build();
		
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();
		scheduler.scheduleJob(job, trigger);
		scheduler.start();
	}
}
