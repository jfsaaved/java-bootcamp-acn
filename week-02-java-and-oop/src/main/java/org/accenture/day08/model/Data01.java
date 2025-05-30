package org.accenture.day08.model;

public class Data01 extends BaseEntity {

    private Integer id;
    private String dataName;
    private Sub01Data01 sub01Data01;
    private Sub02Data01 sub02Data01;

    public Data01() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    public Sub01Data01 getSub01Data01() {
        return sub01Data01;
    }

    public void setSub01Data01(Sub01Data01 sub01Data01) {
        this.sub01Data01 = sub01Data01;
    }

    public Sub02Data01 getSub02Data01() {
        return sub02Data01;
    }

    public void setSub02Data01(Sub02Data01 sub02Data01) {
        this.sub02Data01 = sub02Data01;
    }

}
