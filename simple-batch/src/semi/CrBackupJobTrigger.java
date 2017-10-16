package semi;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class CrBackupJobTrigger {

	public static void main(String[] args) throws Exception{
		
		JobDetail job = JobBuilder.newJob(CrBackupJob.class).build();

		Trigger trigger = TriggerBuilder.newTrigger().withSchedule(CronScheduleBuilder.cronSchedule("0 0 0 * * ?")).build();

		Scheduler scheduler = new StdSchedulerFactory().getScheduler();
		scheduler.scheduleJob(job, trigger);
		scheduler.start();
	}
}
