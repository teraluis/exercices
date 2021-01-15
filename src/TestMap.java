import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer,String> employeeIdn = new HashMap<>();
        employeeIdn.put(1989,"Luis");
        employeeIdn.put(1992,"Clara");
        employeeIdn.put(2016,"Kim");
        employeeIdn.put(2019,"Apolline");

        Set<Map.Entry<Integer,String>> entrySet = employeeIdn.entrySet();

        List<Map.Entry<Integer,String>> list = new ArrayList<>(entrySet);

        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue()) * (-1);
            }
        });

        list.forEach(x -> {
            System.out.println(x.getValue());
        });
    }
}
