package net.stuqs.spring.core.loggers;

import net.stuqs.spring.core.beans.Event;

public interface EventLogger {
    void logEvent(Event event);
}