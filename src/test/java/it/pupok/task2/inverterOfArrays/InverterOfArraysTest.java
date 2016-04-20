package it.pupok.task2.inverterOfArrays;

import it.pupok.task2.my_exception.MyFirstException;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Test for the class InverterOfArrays
 */
public class InverterOfArraysTest {

    /**
     * Test for the method InverterForArray
     * @throws MyFirstException
     */
    @Test
    public void testInverterForArray () throws MyFirstException {
        InverterOfArrays inverter = new InverterOfArrays();
        ArrayList<Integer> expectedArrayList = new ArrayList<Integer>();
        ArrayList<Integer> actualArrayList = new ArrayList<Integer>();

        actualArrayList.add(0);
        actualArrayList.add(1);
        actualArrayList.add(2);

        expectedArrayList.add(2);
        expectedArrayList.add(1);
        expectedArrayList.add(0);

        inverter.inverterForArray(expectedArrayList);

        assertEquals(actualArrayList, expectedArrayList);
    }
}