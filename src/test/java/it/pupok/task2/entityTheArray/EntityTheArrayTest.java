package it.pupok.task2.entityTheArray;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Test for the class EntityTheArray
 */
public class EntityTheArrayTest {

    ArrayList<Integer> actualArrayList = new ArrayList<Integer>();
    EntityTheArray<Integer> expectedArrayList = new EntityTheArray<Integer>();

    /**
     * Test for the method getArray
     */
    @Test
    public void testGetArray() {
        this.actualArrayList.add(0);
        this.expectedArrayList.setArray(0);

        assertEquals(actualArrayList, expectedArrayList.getArray());
    }

    /**
     * Test for the method setArray
     */
    @Test
    public void testSetArray() {
        this.expectedArrayList.setArray(0);

        assertNotNull(expectedArrayList);
        assertEquals(actualArrayList, expectedArrayList);
    }
}