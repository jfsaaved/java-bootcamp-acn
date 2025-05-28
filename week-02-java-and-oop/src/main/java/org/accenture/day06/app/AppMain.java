package org.accenture.day06.app;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.accenture.day06.controller.AggregatedDataController;
import org.accenture.day06.controller.ServiceRequestController;
import org.accenture.day06.enums.Status;
import org.accenture.day06.model.Data01;
import org.accenture.day06.model.Data02;
import org.accenture.day06.repository.Data01RepositoryHashImpl;
import org.accenture.day06.repository.Data01RepositoryQueueImpl;
import org.accenture.day06.repository.Data02RepositoryHashImpl;
import org.accenture.day06.repository.EventLoggerListImpl;
import org.accenture.day06.service.Data01Service;
import org.accenture.day06.service.Data02Service;
import org.accenture.day06.service.RequestService;
import org.accenture.day06.utility.RestTemplate;

import java.time.LocalDate;
import java.util.UUID;

/**
 * This class simulates how this application will be called in a Microservice system
 */
public class AppMain {
    public static void simulateApplicationRun(AggregatedDataController aggregatedDataController) throws JsonProcessingException {
        // Example run -> In real life, other microservices will be calling our controller
        for (int i = 0; i < 10; i++) {
            Data01 data01 = new Data01();
            Data02 data02 = new Data02();

            UUID data02UUID = UUID.randomUUID();
            String data02Name = "Data 02 - " + data02UUID;
            data02.setUuid(data02UUID);
            data02.setDataName(data02Name);
            data02.setType("General Type");
            data02.setSomeOtherId(data02Name + Math.random());

            UUID data01UUID = UUID.randomUUID();
            data01.setUuid(data01UUID);
            data01.setDataName("Data 01 - " + data01UUID);
            data01.setCategory("General Category");
            data01.setData02Name(data02Name);

            data01.setCreatedAt(LocalDate.now());
            data01.setUpdatedAt(LocalDate.now());

            data02.setCreatedAt(LocalDate.now());
            data02.setUpdatedAt(LocalDate.now());

            aggregatedDataController.postData(data01, data02);
        }
    }

    public static void main(String[] args) throws InterruptedException, JsonProcessingException {
        // With a good design things are easily replaceable
        Data01RepositoryHashImpl database01Data01 = new Data01RepositoryHashImpl();
        Data01RepositoryQueueImpl database02Data01 = new Data01RepositoryQueueImpl();

        // Second database
        // TODO Create a Data02RepositoryQueueImpl class that uses Queue data structure
        //  Follow-up: Inject this Database implementation to AggregatedDataController and re-run
        Data02RepositoryHashImpl database01Data02 = new Data02RepositoryHashImpl();

        // Our logger
        // TODO Create another Event Logger implementation using Stack data structure
        //  Follow-up: Inject this Event Logger implementation to AggregatedDataController and re-run
        EventLoggerListImpl eventLogger = new EventLoggerListImpl();

        // Our Services and Controller
        // We can replace and plug in different database interfaces
        Data01Service data01Service = new Data01Service(database01Data01);
        Data02Service data02Service = new Data02Service(database01Data02);
        AggregatedDataController aggregatedDataController =
                new AggregatedDataController(data01Service, data02Service, eventLogger);

        simulateApplicationRun(aggregatedDataController);

        // Output results
        System.out.println("Scenario 01: " + eventLogger.getAll());

        // ************************************************************************

        RequestService requestService = new RequestService(new RestTemplate());
        ServiceRequestController serviceRequestController = new ServiceRequestController(requestService);

        for (int i = 0; i < 100; i++) {
            Status result = serviceRequestController.getRequest(3);
            System.out.println("Scenario 02: Request Made - " + result);
            Thread.sleep(100);
        }
    }
}
