package hw12;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
public class FileNavigator {
    private Map<String, List<FileData>> map;

    public FileNavigator() {
        map = new HashMap<>();
    }

    public void add(String fileName, byte fileSize, String filePath) {
        FileData fileData = new FileData(fileName, fileSize, filePath);
        List<FileData> fileList = map.getOrDefault(filePath, new ArrayList<>());
        fileList.add(fileData);
        map.put(filePath, fileList);
    }

    public void printFileList() {
        for (String key : map.keySet()) {
            System.out.println("Path: " + key);
            List<FileData> fileList = map.get(key);
            for (FileData fileData : fileList) {
                System.out.println(fileData.toString());
            }
            System.out.println("--------");
        }
    }

        public String find(String findByPath) {
        String result = "";
            for (String key : map.keySet()) {
                List<FileData> fileList = map.get(key);
                for (FileData fileData : fileList) {
                    if (Objects.equals(findByPath, key)){
                        result = result + fileData.toString() + '\n';
                    }
                }
            }
            return result;
    }

    public String filterBySize(byte maxSize) {
        String result = "";
        for (List<FileData> fileList : map.values()) {
            for (FileData fileData : fileList) {
                if (fileData.getFileSize() <= maxSize) {
                    result = result + fileData + '\n';
                }
            }
        }
        return result;
    }

    public void remove(String removeByPath) {
            if (map.containsKey(removeByPath)) {
            map.remove(removeByPath);
        }
    }


}

