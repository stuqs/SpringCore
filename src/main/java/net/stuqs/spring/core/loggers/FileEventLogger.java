package net.stuqs.spring.core.loggers;

import net.stuqs.spring.core.beans.Event;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileEventLogger implements EventLogger {
    private String filename;
    private File file;


    public FileEventLogger(String filename) {
        this.filename = filename;
    }

    public void init() throws IOException {
        file = new File(filename);
    }

    @Override
    public void logEvent(Event event) {
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.append(event.toString().trim());
            fw.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
