package hw10;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Task_03 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        int count = 20;
        List<Integer> newList = getList(list, count);
        System.out.println("First default list of the random " + count + " elements: " + newList);

        List<Integer> resultArray = findUnique(newList);
        System.out.println("Second list of the unique numbers from the first list: " + resultArray);
    }

    public static List<Integer> findUnique(List<Integer> newList){
        Set<Integer> uniqueSet = new HashSet<>();
        List<Integer> uniqueList = new ArrayList<>();

        for(Integer number : newList){
                if (uniqueSet.add(number)) {
                    uniqueList.add(number);
                }
        }
        return uniqueList;
    }

    private static Integer getRandomWords(List<Integer> list){
        return list.get((int) (Math.random()*10));
    }

    private static List<Integer> getList(List<Integer> list, int count){
        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            newList.add(getRandomWords(list));
        }
        return newList;
    }

}
