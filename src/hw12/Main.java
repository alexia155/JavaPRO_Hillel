package hw12;

public class Main {
    public static void main(String[] args) {
        FileNavigator fileNavigator = new FileNavigator();

        fileNavigator.add("Analytics.exe", (byte) 45, "/projects/2023");
        fileNavigator.add("AllDocs.pdf", (byte) 126, "/docs/all");
        fileNavigator.add("PhotoDocs.png", (byte) 100, "/docs/all");
        fileNavigator.add("Screenshots.jpg", (byte) 20, "/correspondence/photos/screenshots");


       System.out.println("--------------------THE LIST OF ALL FILES: ");
       fileNavigator.printFileList();

       String findByPath = "/docs/all";
       System.out.println("--------------------FILES WITH THE PATH '" + findByPath + "': ");
       System.out.println(fileNavigator.find(findByPath));

       byte maxSize = 60;
       System.out.println("--------------------FILES WITH SIZE <= " + maxSize + "B: ");
       System.out.println(fileNavigator.filterBySize(maxSize));

       String removeByPath = "/correspondence/photos/screenshots";
       fileNavigator.remove(removeByPath);
       System.out.println("--------------------THE FILES' LIST AFTER REMOVING: ");
       fileNavigator.printFileList();
    }
}