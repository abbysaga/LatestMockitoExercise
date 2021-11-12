import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    @Test
    void retrievedata() {

        BookInterfaceImplement bb = new BookInterfaceImplement();
        BookService bk = new BookService(bb);

        List<String> fl = bk.retrievedata();

        assertEquals(2, fl.size());

    }

    @Test
    void computetest(){
        BookInterfaceImplement bb = new BookInterfaceImplement();
        BookService bk = new BookService(bb);

        HashMap<String, Double> map = new HashMap<String, Double>();

        List<String> fl = bk.retrievedata();
        map = bk.Discount();

        assertEquals(2, (map.size()));
    }
}