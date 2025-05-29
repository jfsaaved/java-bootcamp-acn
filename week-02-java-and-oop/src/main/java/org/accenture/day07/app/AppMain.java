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
        simulateRun();
    }

    private static void simulateRun() throws InterruptedException {
        // Dependency injection
        MessageService messageService = new MessageServiceImpl();
        Data01Service data01Service = new Data01Service(messageService);
        Data01Controller data01Controller = new Data01Controller(data01Service);

        Logger log = new Logger(Data01Controller.class);

        for (int i = 0; i < 100; i++) {
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
