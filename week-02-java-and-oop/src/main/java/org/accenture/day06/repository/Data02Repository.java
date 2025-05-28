package org.accenture.day06.repository;

import org.accenture.day06.model.Data02;

public interface Data02Repository {
    void saveData02(Data02 data02);

    Data02 getData02(String dataName);
}
