package pl.zimi.zadanka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MainTest {

    @Test
    void ensureSorting() {
        List<String> testValues = Arrays.asList("635", "221133", "123", "74");
        Assertions.assertEquals(Arrays.asList(123, 221133), Main.processData(testValues));
    }

    @Test
    void thisWIllFail() {
        List<String> testValues = Arrays.asList("635", "221133", "123", "74");
        Assertions.assertEquals(Arrays.asList(122, 221133), Main.processData(testValues));
    }

}
