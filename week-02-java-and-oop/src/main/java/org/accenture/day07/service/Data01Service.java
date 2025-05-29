package org.accenture.day07.service;

import org.accenture.day07.logging.Logger;
import org.accenture.day07.messaging.MessageService;
import org.accenture.day07.model.Data01;
import org.accenture.day07.util.RandomGenerator;

import java.util.List;

import static org.accenture.day07.util.AppConstants.*;


public class Data01Service {
    private final MessageService messageService;
    private final static Logger log = new Logger(Data01Service.class);

    public Data01Service(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendDataMessage(Data01 data01) {
        // TODO Create 10 FunctionalInterface and create lambdas for each

        // TODO Implement check if positive via imperative vs higher-order function

        List<Integer> reusableList = RandomGenerator.generateRandomList(10, 100);
        Integer calculatedValue = calculateIfBelowOrEqual50(reusableList);
        Integer anotherCalculatedValue = calculateIfAbove50(reusableList);
        log.warn("Something calculated: %s %s", calculatedValue, anotherCalculatedValue);

        messageService.sendToTopic(SUM_TOPIC, calculateSum(data01));
        if (data01.getSub01Data01() != null)
            messageService.sendToTopic(SUM_EVEN_TOPIC, calculateEvenSum(data01));
        if (data01.getSub02Data01() != null)
            messageService.sendToTopic(SUM_ODD_TOPIC, calculateOddSum(data01));
    }

    // TODO Refactor to remove duplicate code
    private Integer calculateIfBelowOrEqual50(List<Integer> numbers) {
        int result = 0;

        for (Integer num : numbers) {
            if (num <= 50) result += num;
        }

        return result;
    }

    private Integer calculateIfAbove50(List<Integer> numbers) {
        int result = 0;

        for (Integer num : numbers) {
            if (num > 50) result += num;
        }

        return result;
    }

    // TODO Refactor to remove duplicate code
    private Integer calculateSum(Data01 data01) {
        List<Integer> sub01Data01List = data01.getSub01Data01().getListOfNumbers();
        List<Integer> sub02Data01List = data01.getSub02Data01().getListOfNumbers();

        int result = 0;

        for (Integer num01 : sub01Data01List) {
            result += num01;
        }

        for (Integer num02 : sub02Data01List) {
            result += num02;
        }

        return result;
    }

    private Integer calculateEvenSum(Data01 data01) {
        List<Integer> sub01Data01List = data01.getSub01Data01().getListOfNumbers();
        List<Integer> sub02Data01List = data01.getSub02Data01().getListOfNumbers();

        int result = 0;

        for (Integer num01 : sub01Data01List) {
            if (num01 % 2 == 0) result += num01;
        }

        for (Integer num02 : sub02Data01List) {
            if (num02 % 2 == 0) result += num02;
        }

        return result;
    }

    private Integer calculateOddSum(Data01 data01) {
        List<Integer> sub01Data01List = data01.getSub01Data01().getListOfNumbers();
        List<Integer> sub02Data01List = data01.getSub02Data01().getListOfNumbers();

        int result = 0;

        for (Integer num01 : sub01Data01List) {
            if (num01 % 2 != 0) result += num01;
        }

        for (Integer num02 : sub02Data01List) {
            if (num02 % 2 != 0) result += num02;
        }

        return result;
    }
}
