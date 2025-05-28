package org.accenture.day06.lessons.model;

import java.util.UUID;

public class Data01 extends BaseEntity {
    private UUID uuid;
    private String dataName;
    private String category;
    private String data02Name; // Data02's variable: dataName
    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getData02Name() {
        return data02Name;
    }

    public void setData02Name(String data02Name) {
        this.data02Name = data02Name;
    }
}
