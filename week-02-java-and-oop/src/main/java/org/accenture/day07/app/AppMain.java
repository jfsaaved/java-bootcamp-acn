package org.accenture.day07.app;

import org.accenture.day07.controller.Data01Controller;
import org.accenture.day07.enums.Status;
import org.accenture.day07.logging.Logger;
import org.accenture.day07.messaging.MessageService;
import org.accenture.day07.messaging.MessageServiceImpl;
import org.accenture.day07.model.Data01;
import org.accenture.day07.model.Sub01Data01;
import org.accenture.day07.model.Sub02Data01;
import org.accenture.day07.service.Data01Service;
import org.accenture.day07.util.RandomGenerator;

import static org.accenture.day07.util.RandomGenerator.RANDOM;

public class AppMain {

    public static void main(String[] args) throws InterruptedException {
        bootUp();
        simulateRun();
    }

    private static void bootUp() throws InterruptedException {
        System.out.println("  .   ____          _            __ _ _");
        System.out.println(" /\\\\ / ___'_ __ _ _(_)_ __  __ _ \\ \\ \\ \\");
        System.out.println("( ( )\\___ | '_ | '_| | '_ \\/ _` | \\ \\ \\ \\");
        System.out.println(" \\\\/  ___)| |_)| | | | | || (_| |  ) ) ) )");
        System.out.println("  '  |____| .__|_| |_|_| |_\\__, | / / / /");
        System.out.println(" =========|_|==============|___/=/_/_/_/");
        System.out.println(" :: Spring Boot :: (mock version)");

        Thread.sleep(400);

        Logger log = new Logger(AppMain.class);
        log.info("Starting DemoApplication using Java 17.0.9");
        Thread.sleep(200);
        log.info("No active profile set, falling back to default profiles: default");
        Thread.sleep(200);
        log.info("EmbeddedWebServer initialized on port 8080");
        Thread.sleep(300);
        log.info("Application started in 1.230 seconds (JVM running for 1.451)");
    }

    private static void simulateRun() throws InterruptedException {
        MessageService messageService = new MessageServiceImpl();
        Data01Service data01Service = new Data01Service(messageService);
        Data01Controller data01Controller = new Data01Controller(data01Service);

        Logger log = new Logger(AppMain.class);

        while(true) {
            Data01 incomingData = createData01();
            Status result = data01Controller.putMethod(incomingData);
            Thread.sleep(RANDOM.nextInt(500));
            if(result.equals(Status.SUCCESS)) {
                log.info("{status:200,app_name:number-processor-service}");
            } else {
                log.warn("{status:500,app_name:number-processor-service}");
            }
        }
    }

    private static Data01 createData01() {
        Sub01Data01 sub01Data01 = new Sub01Data01();
        Sub02Data01 sub02Data01 = new Sub02Data01();

        sub01Data01.setId(RANDOM.nextInt());
        sub01Data01.setListOfNumbers(RandomGenerator.generateRandomList(RANDOM.nextInt(10), 100));

        sub02Data01.setId(RANDOM.nextInt());
        sub02Data01.setListOfNumbers(RandomGenerator.generateRandomList(RANDOM.nextInt(10), 100));

        Data01 data01 = new Data01();
        data01.setId(RANDOM.nextInt(99999));
        data01.setDataName(RandomGenerator.generateDataName());
        data01.setSub01Data01(sub01Data01);
        data01.setSub02Data01(sub02Data01);

        return data01;
    }
}
