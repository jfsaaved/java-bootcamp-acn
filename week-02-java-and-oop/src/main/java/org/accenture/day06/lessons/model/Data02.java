package org.accenture.day06.lessons.model;

import java.util.UUID;

public class Data02 extends BaseEntity {
    private UUID uuid;
    private String dataName; // Data01's variable: data02Name
    private String type;
    private String someOtherId;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSomeOtherId() {
        return someOtherId;
    }

    public void setSomeOtherId(String someOtherId) {
        this.someOtherId = someOtherId;
    }
}
