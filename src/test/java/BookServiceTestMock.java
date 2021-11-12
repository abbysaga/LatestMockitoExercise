import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.OngoingStubbing;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookServiceTestMock {
    @Mock
    BookInterface bs;   // 10
    @InjectMocks
    BookService bb;     // 10
    @Captor
    ArgumentCaptor<String> ss;  // 17

    @Test
    public void retrieveBooks() {
        List<String> bks = Arrays.asList("PHP", "Java for Dummies", "Java for Experts", "HTML");
        Mockito.when(bs.retrieveTodos()).thenReturn(bks);

        List<String> ff = bb.retrievedata();

        assertEquals( 2, ff.size());
    }
    public void retrieveBooksEmpty() {
        List<String> bks = Arrays.asList();
        Mockito.when(bs.retrieveTodos()).thenReturn(bks);

        List<String> ff = bb.retrievedata();

        assertEquals(0, ff.size());
    }

    @Test
    public void computeTest(){
        List<String> bks = Arrays.asList("PHP", "Java for Dummies", "Java for Experts", "HTML");
        Mockito.when(bs.retrieveTodos()).thenReturn(bks);

        bb.Discount();

        verify(bs).getprice("Java for Dummies");
        verify(bs, times(1)).getprice("Java for Experts");
        verify(bs, never()).getprice("PHP");
    }

    @Test
    public void bookWithArgs() {
        List<String> bks = Arrays.asList("PHP", "Java for Dummies", "Java for Experts", "HTML");
        Mockito.when(bs.retrieveTodos()).thenReturn(bks);

        bb.Discount();

        verify(bs, times(2)).getprice(ss.capture());
        assertEquals("Java for Experts", ss.getValue());
    }
}
