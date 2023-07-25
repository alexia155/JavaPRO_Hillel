package hw24.entity;

import lombok.Data;

@Data
public class FileLoggerConfiguration {
    private String path;
    private LoggingLevel level;
    private Integer maxFileSize;
    private String logFormat;

    public FileLoggerConfiguration(String path, LoggingLevel level, Integer maxFileSize, String logFormat) {
        this.path = path;
        this.level = level;
        this.maxFileSize = maxFileSize;
        this.logFormat = logFormat;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public LoggingLevel getLevel() {
        return level;
    }

    public void setLevel(LoggingLevel level) {
        this.level = level;
    }

    public Integer getMaxFileSize() {
        return maxFileSize;
    }

    public void setMaxFileSize(Integer maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    public String getLogFormat() {
        return logFormat;
    }

    public void setLogFormat(String logFormat) {
        this.logFormat = logFormat;
    }
}
