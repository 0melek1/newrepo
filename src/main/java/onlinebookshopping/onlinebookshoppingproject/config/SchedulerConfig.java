package onlinebookshopping.onlinebookshoppingproject.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@Configuration
public class SchedulerConfig {

    public class SchedulerConfig {

        @Scheduled(fixedDelay = 2000, initialDelay = 100_000)
        public void metod1() {
            System.out.println("scheduler calisir");
        }


}
