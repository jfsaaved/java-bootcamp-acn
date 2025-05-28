package org.accenture.day06.lessons.repository;

import org.accenture.day06.lessons.model.Data02;

import java.util.HashMap;
import java.util.Map;

public class Data02RepositoryHashImpl implements Data02Repository {

    private Map<String, Data02> data02HashMap;

    public Data02RepositoryHashImpl() {
        this.data02HashMap = new HashMap<>();
    }

    @Override
    public void saveData02(Data02 data02) {
        data02HashMap.put(data02.getDataName(), data02);
    }

    @Override
    public Data02 getData02(String dataName) {
        return data02HashMap.get(dataName);
    }
}
