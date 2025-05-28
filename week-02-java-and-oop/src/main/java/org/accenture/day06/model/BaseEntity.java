package org.accenture.day06.model;

import java.time.LocalDate;

public abstract class BaseEntity {
    protected LocalDate createdAt;
    protected LocalDate updatedAt;

    public LocalDate getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

}
