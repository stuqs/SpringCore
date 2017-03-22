package net.stuqs.spring.core.loggers;

import net.stuqs.spring.core.beans.Event;

public class ConsoleEventLogger implements EventLogger {
    public void logEvent(Event event) {
        System.out.println(event);
    }
}