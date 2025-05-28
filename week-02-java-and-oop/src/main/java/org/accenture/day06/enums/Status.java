package org.accenture.day06.enums;

public enum Status {
    SUCCESS(200),
    ERROR(500);

    private final int code;

    Status(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }
}
