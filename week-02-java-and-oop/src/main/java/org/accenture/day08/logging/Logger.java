package org.accenture.day08.logging;

public class Logger {
    private final String className;

    public Logger(Class<?> clazz) {
        this.className = clazz.getSimpleName();
    }

    public void info(String format, Object... args) {
        System.out.println("[INFO] [" + className + "] " + String.format(format, args));
    }

    public void warn(String format, Object... args) {
        System.out.println("[WARN] [" + className + "] " + String.format(format, args));
    }

    public void error(String format, Object... args) {
        System.err.println("[ERROR] [" + className + "] " + String.format(format, args));
    }
}
