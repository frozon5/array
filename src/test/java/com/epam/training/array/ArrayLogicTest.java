package com.epam.training.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayLogicTest {

    //TODO: add tests for various scenarios

    private ArrayLogic arrayLogic = new ArrayLogic();

    @Test
    public void testSort(){
        //given
        int[] array = new Array().getItems();
        //when
        int[] result = arrayLogic.sort(array);
        //then
        int j = 0;
        for(int i = 0; i < array.length; i++){
            assertTrue(array[i] >= j);
            j = array[i];
        }
    }

    @Test
    public void testSearch(){
        //given
        int[] array = new Array().getItems();
        //when
        boolean result = arrayLogic.exists(array, 4);
        //then
        assertTrue(result);
    }

    @Test
    public void testFindMax(){
        //given
        Integer[] array = new Array().getArray();
        //when
        int result = arrayLogic.findMax(array);
        //then
        assertEquals(4, result);
    }

    @Test
    public void testFindMin(){
        //given
        Integer[] array = new Array().getArray();
        //when
        int result = arrayLogic.findMin(array);
        //then
        assertEquals(0, result);
    }

    @Test
    public void testFindPrimeNumbers(){
        //given
        int[] array = new Array().getItems();
        //when
        int[] result = arrayLogic.findPrimeNumbers(array);
        //then
        assertArrayEquals(new int[]{0, 1, 2, 3, 0}, result);
    }


}
