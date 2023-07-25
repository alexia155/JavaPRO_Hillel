package hw24.service;

import hw24.entity.FileLoggerConfiguration;
import hw24.entity.LoggingLevel;
import hw24.exceptions.FileMaxSizeReachedException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@AllArgsConstructor
public class FileLogger {
    private FileLoggerConfiguration config;

    //методи debug та info - для запису у вказаний у конфігурації файл у встановленому форматі для запису з конфігурації
    public void debug(String message) {
        if (config.getLevel().compareTo(LoggingLevel.DEBUG) >= 0) {
            log("[DEBUG]", message);
        }
    }

    public void info(String message) {
        if (config.getLevel().compareTo(LoggingLevel.INFO) >= 0) {
            log("[INFO]", message);
        }
    }

    private void log(String level, String message) {
        //Формат запису: [ПОТОЧНИЙ_ЧАС][DEBUG] Повідомлення: [СТРОКА-ПОВІДОМЛЕННЯ]
        String logRecord = String.format("%s %s Message: %s", getCurrentTime(), level, message);

        try {
            //створення файлу
            File logFile = new File(config.getPath());
            long logFileSize = logFile.length();

            //При досягненні максимального розміру файлу або його перевищення, викинути виняток FileMaxSizeReachedException
            if (logFileSize + logRecord.length() > config.getMaxFileSize()) {
                throw new FileMaxSizeReachedException(config.getMaxFileSize(), logFileSize, config.getPath());
            }

            //запис файлу
            FileOutputStream fileOutputStream = new FileOutputStream(config.getPath(), true);
            fileOutputStream.write(logRecord.getBytes(StandardCharsets.UTF_8));
            fileOutputStream.close();
        }
        //the base class for exceptions thrown while accessing information using streams, files and directories
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    //знаходження актуального часу
    private String getCurrentTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "[" + sdf.format(new Date()) + "]";
    }
}
