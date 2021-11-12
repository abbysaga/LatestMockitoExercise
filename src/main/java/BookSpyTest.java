import java.util.ArrayList;

public class BookSpyTest {
    ArrayList<String> l = new ArrayList<String>();

    public ArrayList<String> getL() {
        return l;
    }

    public void setL(ArrayList<String> l) {
        this.l = l;
    }

    BookSpyTest(){
        // Initialize an ArrayList with add()
        l.add("PHP");
        l.add("Java for Dummies");
        l.add("Java for Experts");
    }

    public void addtoarray(String x) {
        l.add(x);
    }
}
