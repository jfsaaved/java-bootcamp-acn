package org.accenture.day06.repository;

import org.accenture.day06.model.Data01;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.UUID;

public class Data01RepositoryQueueImpl implements Data01Repository {
    private Queue<Data01> data01Queue;

    public Data01RepositoryQueueImpl() {
        data01Queue = new PriorityQueue<>();
    }

    @Override
    public void saveData01(Data01 data01) {
        data01Queue.add(data01);
    }

    @Override
    public Data01 getData01(UUID id) {
        for (Data01 data : data01Queue) {
            if (data.getUuid().equals(id)) return data;
        }
        return null;
    }

    public Data01 retrieveHeadElement() {
        return data01Queue.element();
    }
}
