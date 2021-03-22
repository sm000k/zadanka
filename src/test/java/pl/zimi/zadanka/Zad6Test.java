package pl.zimi.zadanka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class Zad6Test {
    @Test
    void templateTest(){

    }
    @Test
    void simpleOneOneTwoTest(){
        Zad6 object= new Zad6();
        int[] nums = {1,1,2};
        Assertions.assertEquals(2,object.removeDuplicates(nums));
    }
    @Test
    void simplelongTest(){
        Zad6 object= new Zad6();
        int[] nums = {1,1,1,1,1,1,2};
        Assertions.assertEquals(2,object.removeDuplicates(nums));
    }
    @Test
    void simple123Test(){
        Zad6 object= new Zad6();
        int[] nums = {1,1,2,2,3,3};
        Assertions.assertEquals(3,object.removeDuplicates(nums));
    }
    @Test
    void simple11123Test(){
        Zad6 object= new Zad6();
        int[] nums = {1,1,1,1,2,3};
        Assertions.assertEquals(3,object.removeDuplicates(nums));
    }
    @Test
    void simple0123Test(){
        Zad6 object= new Zad6();
        int[] nums = {0,1,1,2,2,3,3};
        Assertions.assertEquals(4,object.removeDuplicates(nums));
    }
    @Test
    void longTestTest(){
        Zad6 object = new Zad6();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        Assertions.assertEquals(5,object.removeDuplicates(nums));
    }

    @Test
    void zeroThreeTest(){
        Zad6 object = new Zad6();
        int[] nums = {0, 0, 0, 0, 3 };
        Assertions.assertEquals(2,object.removeDuplicates(nums));
    }
    @Test
    void zeroThreev2Test(){
        Zad6 object = new Zad6();
        int[] nums = {0, 3 };
        Assertions.assertEquals(2,object.removeDuplicates(nums));
    }
    @Test
    void oneOneTest (){
        Zad6 object = new Zad6();
        int[] nums = {1, 1 };
        Assertions.assertEquals(1,object.removeDuplicates(nums));
    }
    @Test
    void minusOneTest (){
        Zad6 object = new Zad6();
        int[] nums = {-1,0,0,0,0,3,3 };
        //[-1,0,3]
        Assertions.assertEquals(3,object.removeDuplicates(nums));
    }

}
