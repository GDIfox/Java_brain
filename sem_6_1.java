import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

    public class sem_6_1 {
        public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
            if (map.containsKey(key)) {
                map.get(key).add(value);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(value);
                map.put(key, list);
            }
        }
        public static void printBook(Map<String, ArrayList<Integer>> map){
            for (var item : map.entrySet()) {
                StringBuilder phones = new StringBuilder();
                for(int el: item.getValue()){
                    phones.append(el).append(", ");
                }
                System.out.printf("%s: %s \n", item.getKey(), phones.toString());
            }
        }
        public static void main(String[] args) {
            Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
            addNumber("John Wick", 777456123, bookPhone);
            addNumber("John Wick", 777789456, bookPhone);
            addNumber("Loki", 666852963, bookPhone);
            addNumber("Keanu Reeves", 444741963, bookPhone);
            addNumber("John Wick", 888951842, bookPhone);
            addNumber("Loki", 666789123, bookPhone);
            printBook(bookPhone);
        }
    }

