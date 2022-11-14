import io.codelex.advancedtest.exercise3.Joiner;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JoinerTest {

    @Test
    public void joinerTest(){
        Joiner<Integer> joiner = new Joiner<>("-");
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
        String result = joiner.join(list);
        Assertions.assertEquals("1-2-3-4", result);
    }
}
