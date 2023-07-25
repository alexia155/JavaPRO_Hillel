package hw24.exceptions;

public class FileMaxSizeReachedException extends RuntimeException {
    private final long maxSize;
    private final long fileSize;
    private final String filePath;

    public FileMaxSizeReachedException(long maxSize, long fileSize, String filePath) {
        this.maxSize = maxSize;
        this.fileSize = fileSize;
        this.filePath = filePath;
    }

    @Override
    public String getMessage() {
        return String.format("!FileMaxSizeReachedException! File is larger than allowed. " +
                             "Maximum file size = %d bytes. " +
                             "Current file size = %d bytes. " +
                             "File path: %s", maxSize, fileSize, filePath);
    }
}
