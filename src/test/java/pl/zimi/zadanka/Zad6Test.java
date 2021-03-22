package pl.zimi.zadanka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class Zad6Test {
    @Test
    void templateTest(){

    }
    @Test
    void simpleOneOneTwo(){
        Zad6 object= new Zad6();
        int[] nums = {1,1,2};
        Assertions.assertEquals(2,object.removeDuplicates(nums));
    }
    @Test
    void simplelong(){
        Zad6 object= new Zad6();
        int[] nums = {1,1,1,1,1,1,2};
        Assertions.assertEquals(2,object.removeDuplicates(nums));
    }
}
