import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BookService {
    private BookInterface bk;

    public BookService(BookInterface bk)
    {
        this.bk = bk;
    }

    public List<String> retrievedata(){
        List<String> filtered = new ArrayList<>();
        List<String> books = bk.retrieveTodos(); // the part where you need the actual method

        for(String bks:books){
            if(bks.contains("Java")){
                filtered.add(bks);
            }
        }

        return filtered;

    }

    public HashMap<String, Double> Discount() {
        List<String> books = bk.retrieveTodos();
        double price = 0;
        double nprice = 0;

        HashMap<String, Double> map2 = new HashMap<String, Double>();

        for (String bks : books) {
            if (bks.contains("Java")){
                price = bk.getprice(bks);
                nprice = price - (price * .1);
                map2.put(bks, nprice);
            }
        }

        return map2;

    }
}
