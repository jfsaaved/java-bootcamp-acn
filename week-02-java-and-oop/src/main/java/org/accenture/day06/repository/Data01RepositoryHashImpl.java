package org.accenture.day06.repository;

import org.accenture.day06.model.Data01;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Data01RepositoryHashImpl implements Data01Repository {
    private Map<UUID, Data01> data01HashMap;

    public Data01RepositoryHashImpl() {
        data01HashMap = new HashMap<>();
    }

    @Override
    public void saveData01(Data01 data01) {
        data01HashMap.put(data01.getUuid(), data01);
    }

    @Override
    public Data01 getData01(UUID id) {
        return data01HashMap.get(id);
    }
}
