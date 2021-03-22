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
    @Test
    void simple123(){
        Zad6 object= new Zad6();
        int[] nums = {1,1,2,2,3,3};
        Assertions.assertEquals(3,object.removeDuplicates(nums));
    }
    @Test
    void simple0123(){
        Zad6 object= new Zad6();
        int[] nums = {0,1,1,2,2,3,3};
        Assertions.assertEquals(4,object.removeDuplicates(nums));
    }
    @Test
    void longtest(){
        Zad6 object = new Zad6();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        Assertions.assertEquals(5,object.removeDuplicates(nums));
    }
}
