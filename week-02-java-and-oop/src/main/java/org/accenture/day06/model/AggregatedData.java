package org.accenture.day06.model;

public class AggregatedData {
    private Data01 data01;
    private Data02 data02;
    public AggregatedData(Data01 data01, Data02 data02) {
        this.data01 = data01;
        this.data02 = data02;
    }
    public Data01 getData01() {
        return data01;
    }

    public void setData01(Data01 data01) {
        this.data01 = data01;
    }

    public Data02 getData02() {
        return data02;
    }

    public void setData02(Data02 data02) {
        this.data02 = data02;
    }

}
