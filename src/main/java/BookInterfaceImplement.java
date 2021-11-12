import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookInterfaceImplement implements BookInterface{
    @Override
    public List<String> retrieveTodos() {

        return Arrays.asList("PHP", "Java for Dummies", "Java for Experts", "HTML");

    }

    @Override
    public double getprice(String x) {
        HashMap<String, Double> map = new HashMap<String, Double>();
        map.put("PHP", 100.0);
        map.put("Java for Dummies", 50.0);
        map.put("Java for Experts", 200.0);
        map.put("HTML", 200.0);

        double s  = map.get(x);

        return s;
    }
}
