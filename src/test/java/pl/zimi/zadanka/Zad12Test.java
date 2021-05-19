package pl.zimi.zadanka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Zad12Test {
    @Test
    void dummytest(){
        Zad12 object = new Zad12();

        Assertions.assertEquals(1,object.singleNumber(new int[] {8,8,1}));
    }
    @Test
    void leetCodeTest(){
        Zad12 object = new Zad12();

        Assertions.assertEquals(4,object.singleNumber(new int[] {4,1,2,1,2}));
    }
}
